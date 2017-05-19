package com.techelevator;

public class PostalServiceSecondClass implements DeliveryDriver {

	public double calculateRate (int distance, int weight) {
		double rate = 0;
		if((weight >= 0) && (weight <= 2))
			rate = distance * 0.0035;
		if ((weight >= 3) && (weight <= 8))
			rate = distance * 0.0040;
		if ((weight >= 9) && (weight <= 15))
			rate = distance * 0.0047;
		if ((weight >= 16) && (weight <= 48))
			rate = distance * 0.0195;
		if ((weight >= 64) && (weight <= 128))
			rate = distance * 0.0450;
		else if (weight > 144)
			rate = distance * 0.0500;
		return rate;
	}
	}
	


