package com.assignments;

import java.util.ArrayList;
import java.util.List;

import com.assignments.pojo.Planet;

public class TestUtil {

	public static List<Planet> getValidTestData() {
		
		List<Planet> myList = new ArrayList<Planet>();
		Planet p1 = new Planet();
		p1.setPlanetIdentifier("Planet-1");
		p1.setHostStarTempK(1234);
		p1.setTypeFlag(3);
		p1.setDiscoveryYear(2019);
		p1.setRadiusJpt(.234);
		
		Planet p2 = new Planet();
		p2.setPlanetIdentifier("Planet-2");
		p2.setHostStarTempK(34);
		p2.setTypeFlag(3);
		p2.setDiscoveryYear(2018);
		p2.setRadiusJpt(1.234);
		
		Planet p3 = new Planet();
		p3.setPlanetIdentifier("Planet-3");
		p3.setHostStarTempK(12);
		p3.setTypeFlag(2);
		p3.setDiscoveryYear(2017);
		p3.setRadiusJpt(2.34);
		
		myList.add(p1);
		myList.add(p2);
		myList.add(p3);
		
		return myList;
	}
	
	public static List<Planet> getInValidTestData() {
		
		List<Planet> myList = new ArrayList<Planet>();
		Planet p1 = new Planet();
		p1.setPlanetIdentifier("Planet-1");
		p1.setHostStarTempK(1234);
		p1.setTypeFlag(3);
		//p1.setDiscoveryYear(2019);
		p1.setRadiusJpt(.234);
		
		Planet p2 = new Planet();
		p2.setPlanetIdentifier("Planet-2");
		p2.setHostStarTempK(34);
		p2.setDiscoveryYear(2018);
		p2.setRadiusJpt(1.234);
		
		Planet p3 = new Planet();
		p3.setPlanetIdentifier("Planet-3");
		p3.setHostStarTempK(12);
		//p3.setDiscoveryYear(2017);
		p3.setRadiusJpt(2.34);
		
		myList.add(p1);
		myList.add(p2);
		myList.add(p3);
		
		return myList;
	}
}
