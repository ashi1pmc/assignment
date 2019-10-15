/********************************************************************
 * File Name:    Planet.java
 *
 * Date Created: Oct 14, 2019
 *
 * ------------------------------------------------------------------
 * Copyright (C) 2019 IINCORE. All Rights Reserved.
 *
 *******************************************************************/

// PACKAGE/IMPORTS 
package com.assignments.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


/**
 *
 * @author Ashish Verma
 * @version 1.0
 *
 */
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Planet {

    private String PlanetIdentifier;
    private Integer TypeFlag;
    private Double PlanetaryMassJpt;
    private Double RadiusJpt;
    private Double PeriodDays;
    private Double SemiMajorAxisAU;
    private Double Eccentricity;
    private Double PeriastronDeg;
    private Double LongitudeDeg;
    private Double AscendingNodeDeg;
    private Double InclinationDeg;
    private Double SurfaceTempK;
    private String DiscoveryMethod;
    private Integer DiscoveryYear;
    private String LastUpdated;
    private String RightAscension;
    private String Declination;
    private Double DistFromSunParsec;
    private Double HostStarMassSlrMass;
    private Double HostStarMetallicity;
    private Double HostStarRadiusSlrRad;
    private Integer HostStarTempK;
    private Double HostStarAgeGyr;

    public Planet() {
        super();
    }

    public String getPlanetIdentifier() {
        return PlanetIdentifier;
    }

    public void setPlanetIdentifier(String planetIdentifier) {
        PlanetIdentifier = planetIdentifier;
    }

    public Integer getTypeFlag() {
        return TypeFlag;
    }

    public void setTypeFlag(Integer typeFlag) {
        TypeFlag = typeFlag;
    }

    public Double getPlanetaryMassJpt() {
        return PlanetaryMassJpt;
    }

    public void setPlanetaryMassJpt(Double planetaryMassJpt) {
        PlanetaryMassJpt = planetaryMassJpt;
    }

    public Double getRadiusJpt() {
        return RadiusJpt;
    }

    public void setRadiusJpt(Double radiusJpt) {
        RadiusJpt = radiusJpt;
    }

    public Double getPeriodDays() {
        return PeriodDays;
    }

    public void setPeriodDays(Double periodDays) {
        PeriodDays = periodDays;
    }

    public Double getSemiMajorAxisAU() {
        return SemiMajorAxisAU;
    }

    public void setSemiMajorAxisAU(Double semiMajorAxisAU) {
        SemiMajorAxisAU = semiMajorAxisAU;
    }

    public Double getEccentricity() {
        return Eccentricity;
    }

    public void setEccentricity(Double eccentricity) {
        Eccentricity = eccentricity;
    }

    public Double getPeriastronDeg() {
        return PeriastronDeg;
    }

    public void setPeriastronDeg(Double periastronDeg) {
        PeriastronDeg = periastronDeg;
    }

    public Double getLongitudeDeg() {
        return LongitudeDeg;
    }

    public void setLongitudeDeg(Double longitudeDeg) {
        LongitudeDeg = longitudeDeg;
    }

    public Double getAscendingNodeDeg() {
        return AscendingNodeDeg;
    }

    public void setAscendingNodeDeg(Double ascendingNodeDeg) {
        AscendingNodeDeg = ascendingNodeDeg;
    }

    public Double getInclinationDeg() {
        return InclinationDeg;
    }

    public void setInclinationDeg(Double inclinationDeg) {
        InclinationDeg = inclinationDeg;
    }

    public Double getSurfaceTempK() {
        return SurfaceTempK;
    }

    public void setSurfaceTempK(Double surfaceTempK) {
        SurfaceTempK = surfaceTempK;
    }

    public String getDiscoveryMethod() {
        return DiscoveryMethod;
    }

    public void setDiscoveryMethod(String discoveryMethod) {
        DiscoveryMethod = discoveryMethod;
    }

    public Integer getDiscoveryYear() {
        return DiscoveryYear;
    }

    public void setDiscoveryYear(Integer discoveryYear) {
        DiscoveryYear = discoveryYear;
    }

    public String getLastUpdated() {
        return LastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        LastUpdated = lastUpdated;
    }

    public String getRightAscension() {
        return RightAscension;
    }

    public void setRightAscension(String rightAscension) {
        RightAscension = rightAscension;
    }

    public String getDeclination() {
        return Declination;
    }

    public void setDeclination(String declination) {
        Declination = declination;
    }

    public Double getDistFromSunParsec() {
        return DistFromSunParsec;
    }

    public void setDistFromSunParsec(Double distFromSunParsec) {
        DistFromSunParsec = distFromSunParsec;
    }

    public Double getHostStarMassSlrMass() {
        return HostStarMassSlrMass;
    }

    public void setHostStarMassSlrMass(Double hostStarMassSlrMass) {
        HostStarMassSlrMass = hostStarMassSlrMass;
    }

    public Double getHostStarRadiusSlrRad() {
        return HostStarRadiusSlrRad;
    }

    public void setHostStarRadiusSlrRad(Double hostStarRadiusSlrRad) {
        HostStarRadiusSlrRad = hostStarRadiusSlrRad;
    }

    public Double getHostStarMetallicity() {
        return HostStarMetallicity;
    }

    public void setHostStarMetallicity(Double hostStarRadiusSlrRad) {
        HostStarMetallicity = hostStarRadiusSlrRad;
    }

    public Integer getHostStarTempK() {
        return HostStarTempK;
    }

    public void setHostStarTempK(Integer hostStarTempK) {
        HostStarTempK = hostStarTempK;
    }

    public Double getHostStarAgeGyr() {
        return HostStarAgeGyr;
    }

    public void setHostStarAgeGyr(Double hostStarAgeGyr) {
        HostStarAgeGyr = hostStarAgeGyr;
    }

}
