package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;
																
	public class KataFizzBuzzTest {
	KataFizzBuzz sut = new KataFizzBuzz();
	
	@Test
	public void testOne() {
		assertEquals("1" , sut.FizzBuzz(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals("2" , sut.FizzBuzz(2));
	}
	@Test
	public void testThree() {
		assertEquals("Fizz" , sut.FizzBuzz(3));
	}
	@Test
	public void testFour() {
		assertEquals("4" , sut.FizzBuzz(4));
	}
	@Test
	public void testFive() {
		assertEquals("Buzz" , sut.FizzBuzz(5));
	}
	@Test
	public void testSix() {
		assertEquals("Fizz" , sut.FizzBuzz(6));
	}
	@Test
	public void testSeven() {
		assertEquals("7" , sut.FizzBuzz(7));
	}
	@Test
	public void testEight() {
		assertEquals("8" , sut.FizzBuzz(8));
	}
	@Test
	public void testNine() {
		assertEquals("Fizz" , sut.FizzBuzz(9));
	}
	@Test
	public void test10() {
		assertEquals("Buzz" , sut.FizzBuzz(10));
	}
	@Test
	public void testEleven() {
		assertEquals("11" , sut.FizzBuzz(11));
	}
	@Test
	public void testTwelve() {
		assertEquals("Fizz" , sut.FizzBuzz(12));
	}
	@Test
	public void testThirteen() {
		assertEquals("13" , sut.FizzBuzz(13));
	}
	@Test
	public void testFourteen() {
		assertEquals("14" , sut.FizzBuzz(14));
	}
	@Test
	public void testFifteen() {
		assertEquals("FizzBuzz" , sut.FizzBuzz(15));
	}
}

//integer.tostring(n) ;   "1"


















