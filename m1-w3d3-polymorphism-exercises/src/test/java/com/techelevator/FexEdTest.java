package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FexEdTest {
	private FexEd sut;
	
	

	@Before
	public void setUp() throws Exception {
		sut = new FexEd();
	}

	@Test
	public void shortDistanceLowWeight() {
		double result = sut.calculateRate(499, 47);
		assertEquals(20.0 , result, 0.01);
		
	}
	
	@Test 
	public void longDistanceHigherWeight() {
		double result = sut.calculateRate(501, 49);
		assertEquals(28.0 , result, 0.01);
	}

}
