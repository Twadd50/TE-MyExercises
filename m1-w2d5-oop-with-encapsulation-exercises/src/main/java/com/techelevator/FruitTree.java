package com.techelevator;

public class FruitTree {
	private String typeOfFruit;
	private int    startingPiecesOfFruit;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.startingPiecesOfFruit = startingPiecesOfFruit;
	}

	public boolean pickFruit (int numberOfPiecesToRemove) {
		if (startingPiecesOfFruit >= numberOfPiecesToRemove) {
			startingPiecesOfFruit = startingPiecesOfFruit - numberOfPiecesToRemove;
				return true;
		}
			else {
			return false;
		}		
		
		
		}
		
	public String getTypeOfFruit() {
		return typeOfFruit;
	}

	public int getPiecesOfFruitLeft() {
		return startingPiecesOfFruit;
	}
	
}