package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FruitTreeTest {

		FruitTree tree;
	
	@Before
	public void setUp() throws Exception {
		tree = new FruitTree("apple", 10);
	}

	@Test
	public void enoughPiecesOfFruitLeftToPick() {
		
		boolean result = tree.PickFruit(5);
		assertEquals(true , result);
		
		result = tree.PickFruit(5);
		assertEquals(true , result);
	}
	
	@Test
	public void notEnoughPiecesOfFruitLeftToPick() {
		
		boolean result = tree.PickFruit(13);
		assertEquals(false , result);
		
		result = tree.PickFruit(10);
		assertEquals(true, result);
		
	}

}








