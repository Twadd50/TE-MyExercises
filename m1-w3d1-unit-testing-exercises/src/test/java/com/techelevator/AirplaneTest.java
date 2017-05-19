package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {

	//	Airplane plane;						//initialize
	
	@Before
	public void setUp() throws Exception {
	//	plane = new Airplane(5 , 50);
		
	}

	@Test
	public void reserveReturnsTrueWhenCoachSeatsAvailable() {
		Airplane plane = new Airplane(5 , 50);			//Arrange
		
		boolean result = plane.Reserve(false , 1);		//act
		assertEquals(true , result);					//assert
		
		result = plane.Reserve(false, 49);
		assertEquals(true , result);
	}
	
	@Test
	public void reserveReturnsFalseWhenCoachSeatsNotAvailable() {
		Airplane plane = new Airplane(5 , 50);
		plane.Reserve(false , 50);
		boolean result = plane.Reserve(false , 1);
		assertEquals(false , result);
	}
}









