package com.techelevator;

public class PostalServiceFirstClass implements DeliveryDriver {

	public double calculateRate (int distance, int weight) {
		double rate = 0;
		if((weight >= 0) && (weight <= 2))
			rate = distance * 0.035;
		if ((weight >= 3) && (weight <= 8))
			rate = distance * 0.040;
		if ((weight >= 9) && (weight <= 15))
			rate = distance * 0.047;
		if ((weight >= 16) && (weight <= 48))
			rate = distance * 0.195;
		if ((weight >= 64) && (weight <= 128))
			rate = distance * 0.450;
		else if (weight > 144)
			rate = distance * 0.500;
		return rate;
	}

}
