package com.techelevator;

public class PostalServiceThirdClass implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, int weight) {
		double rate = 0;
		if((weight >= 0) && (weight <= 2))
			rate = distance * 0.020;
		if ((weight >= 3) && (weight <= 8))
			rate = distance * 0.0022;
		if ((weight >= 9) && (weight <= 15))
			rate = distance * 0.0024;
		if ((weight >= 16) && (weight <= 48))
			rate = distance * 0.0150;
		if ((weight >= 64) && (weight <= 128))
			rate = distance * 0.0160;
		else if (weight > 144)
			rate = distance * 0.0170;
		return rate;
	}

}
