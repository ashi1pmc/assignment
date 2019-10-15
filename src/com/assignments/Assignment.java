/********************************************************************
 * File Name:    Assignment.java
 *
 * Date Created: Oct 14, 2019
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2019 IINCORE. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS 
package com.assignments;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.assignments.pojo.Band;
import com.assignments.pojo.Planet;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 *
 * @author Ashish Verma
 * @version 1.0
 *
 */
public class Assignment {
	
	private Planet hotestStar = null;
	private List<String> orphanPlanet;
	private Map<Integer, Band> yearMap = null;

	Assignment(){
		orphanPlanet = new ArrayList<String>();
		yearMap = new TreeMap<Integer, Band>();
	}

	public String getHotestStarName() {
		return hotestStar.getPlanetIdentifier();
	}

	public Integer getOrphanPlanetCount() {
		return orphanPlanet.size();
	}


	public Integer getYearsCount() {
		return yearMap.size();
	}

	
	public String downloadData(String urlStr) {

		String jsonObj = null;
    	HttpURLConnection conn = null;
        try {

        	URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
            	String msg = "Failed to read data, HTTP error code: " + conn.getResponseCode() + "\nURL: " + url.toString();
                throw new RuntimeException(msg);
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String line = null;
            StringBuffer sBuff = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sBuff.append(line);
            }
            
            conn.disconnect();

            if(sBuff != null) {
            	jsonObj = sBuff.toString();	
            }
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
        	e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	if(conn != null) {
        		conn.disconnect();
        	}
        }
        
        return jsonObj;
	}
	
	public void doProcessing(String jsonStr) {
		try {
            ObjectMapper mapper = new ObjectMapper();
            List<Planet> resObj = mapper.readValue(jsonStr,
                    new TypeReference<List<Planet>>() {
                    });

            
            for (Planet resp : resObj) {

                // process req 1
                if ((resp.getTypeFlag() != null) && (resp.getTypeFlag() == 3)) {
                    orphanPlanet.add(resp.getPlanetIdentifier());
                }

                // process req 2
                if ((hotestStar == null) && (resp.getHostStarTempK() != null)
                        && (resp.getHostStarTempK() > 0)) {

                    hotestStar = resp;

                } else {
                    if ((resp.getHostStarTempK() != null)
                            && (resp.getHostStarTempK() > hotestStar
                                    .getHostStarTempK())) {
                        hotestStar = resp;
                    }
                }

                // process req 3
                generateStatsByYear(resp);
            }

        } catch (Exception e) {
        	System.out.println("Failed to process the data");
            e.printStackTrace();
        }			
	}

    private void generateStatsByYear(Planet resp) {

        Integer year = resp.getDiscoveryYear();
        if(year == null) {
        	return;//year = 0000;
        }
        
        if(resp.getRadiusJpt() == null) {
        	return;
        }
        
        Band cBand = null;

        if (yearMap.containsKey(year)) {
            cBand = yearMap.get(year);
        } else {
            cBand = new Band();
            yearMap.put(year, cBand);
        }

        if (resp.getRadiusJpt() < 1) {
            cBand.getSmall().addAndGet(1);

        } else if (resp.getRadiusJpt() < 2) {
            cBand.getMedium().addAndGet(1);

        } else {
            cBand.getLarge().addAndGet(1);
        }
    }

	public static void main(String[] args) {

    	String urlStr = "https://gist.githubusercontent.com/joelbirchler/66cf8045fcbb6515557347c05d789b4a/raw/9a196385b44d4288431eef74896c0512bad3defe/exoplanets";
    	Assignment assignmentObj = new Assignment();
    	String jsonData = assignmentObj.downloadData(urlStr);
    	if(jsonData == null) {
    		System.out.println("Failed to download data");
    		return;
    	}
    	
    	assignmentObj.doProcessing(jsonData);

    	assignmentObj.displayOrphanPlanetsDescription();
    	assignmentObj.displayHottestStarDescription();
    	assignmentObj.displayYearAndDistanceDescription();
    }
	
	public void displayOrphanPlanetsDescription() {
        // Response: 1
		System.out.println("Response 1:");
        System.out.println(
                String.format("Total of '%d' Orphan Planets, namely %s\n",
                        orphanPlanet.size(), orphanPlanet));
	}
	
	public void displayHottestStarDescription() {
		// Response: 2
		System.out.println("Response 2:");
        System.out
                .println(String.format("Planet \"%s\" has the hotest star %d\n",
                        hotestStar.getPlanetIdentifier(),
                        hotestStar.getHostStarTempK()));
	}

	public void displayYearAndDistanceDescription() {
        // Response: 3            
        System.out.println("Response 3:");
        for (Integer year : yearMap.keySet()) {
            Band b = yearMap.get(year);
            if(year <= 0) {
            	continue;
            }

            System.out.println(String.format(
                    "In %d, we discovered %d small planets, %d medium planets and %d large planets.",
                    year, b.getSmall().longValue(),
                    b.getMedium().longValue(),
                    b.getLarge().longValue()));
        }
	}
}
