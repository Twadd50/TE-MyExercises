package com.techelevator;

public class SPUTwoDay implements DeliveryDriver {
	
	public double calculateRate (int distance, int weight) {
		double rate = (weight * 0.050 * distance);
				return rate;
	}

}
