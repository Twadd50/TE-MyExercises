package com.techelevator;

public class Car implements CalculateRate {
	
	public double CalculateToll(int distance)  {
	public boolean pullingTrailer = true;
		double toll = 0.020 * distance;
			if (pullingTrailer == true){
				toll += 1.00;
			}
				
		
	}

}
