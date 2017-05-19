package com.techelevator;

public class FexEd implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, int weight) {
	    double rate = 20;
	    if(distance > 500)
	    	rate = rate + 5.00;
	    if(weight > 48)
	    	rate = rate + 3.00;
		return rate;
	}																		//	extends   - inherits from another class
																			// implements - implements interface

}
