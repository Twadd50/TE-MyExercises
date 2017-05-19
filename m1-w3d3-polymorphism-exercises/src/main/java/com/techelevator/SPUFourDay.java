package com.techelevator;

public class SPUFourDay implements DeliveryDriver {
	@Override
	public double calculateRate (int distance, int weight) {
		double rate = (weight * 0.0050) * distance;
		return rate;
	}

}
