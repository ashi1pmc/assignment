package com.assignments;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.assignments.pojo.Planet;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class AssignmentTest {

	@Test
	void testHotestStarName() throws JsonProcessingException {
		
		List<Planet> dataObj = TestUtil.getValidTestData();
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(dataObj);

		Assignment myObj = new Assignment();
		myObj.doProcessing(jsonString);
		
		assertTrue(myObj.getHotestStarName().equals("Planet-1"));
	}
	
	@Test
	void testYearsCount() throws JsonProcessingException {
		
		List<Planet> dataObj = TestUtil.getValidTestData();
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(dataObj);

		Assignment myObj = new Assignment();
		myObj.doProcessing(jsonString);
		
		assertTrue(myObj.getYearsCount() == 3);
	}
	
	@Test
	void testOrphanPlanetCount() throws JsonProcessingException {
		
		List<Planet> dataObj = TestUtil.getValidTestData();
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(dataObj);

		Assignment myObj = new Assignment();
		myObj.doProcessing(jsonString);
		
		assertTrue(myObj.getOrphanPlanetCount() == 2);
	}
	
	@Test
	void testInvalidDataSet() throws JsonProcessingException {
		
		List<Planet> dataObj = TestUtil.getInValidTestData();
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(dataObj);

		Assignment myObj = new Assignment();
		myObj.doProcessing(jsonString);
		

		System.out.println(myObj.getHotestStarName());
		System.out.println(myObj.getOrphanPlanetCount());
		System.out.println(myObj.getYearsCount());
	}

}
