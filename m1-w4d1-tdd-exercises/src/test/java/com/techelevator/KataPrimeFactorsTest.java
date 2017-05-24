package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPrimeFactorsTest {
	KataPrimeFactors sut;
	
	@Before
	public void setUp() {
		sut =  new KataPrimeFactors();
	}
	
	@Test
	public void testTwo() {
		assertArrayEquals(new int[] {2}, sut.factorize(2));
	}

	public void testThree() {
		assertArrayEquals (new int[] {3}, sut.factorize(3));
		
	}
	
	@Test
	public void testSix() {
		assertArrayEquals (new int[] {2,3}, sut.factorize(6));
	}
	
	@Test
	public void testEight() {
		assertArrayEquals (new int[] {2,2,2}, sut.factorize(8));
	
}
	
	@Test
	public void testFive() {
		assertArrayEquals (new int[] {5}, sut.factorize(5));
	}
	
	@Test
	public void testThirtyFive() {
		assertArrayEquals(new int[] {5,7}, sut.factorize(35));
	}
}

















