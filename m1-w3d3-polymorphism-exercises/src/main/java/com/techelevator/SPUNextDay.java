package com.techelevator;

public class SPUNextDay implements DeliveryDriver{
	
	public double calculateRate (int distance, int weight){
		double rate = (weight * .75) * distance;
		return rate;
	}
	

}
