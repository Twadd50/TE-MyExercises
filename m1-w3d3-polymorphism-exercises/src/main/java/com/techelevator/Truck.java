package com.techelevator;

public class Truck implements CalculateToll {
	@Override
	public double tollAmount(int distance) {
		@Override
		public double CalculateToll(int numberOfAxels) {
			double toll = distance * 0.020;
				if(numberOfAxels = 4)  
					toll = distance * 0.040;
				if(numberOfAxels = 6) 
					toll = distance * 0.045;
				if(numberOfAxels >= 8)
					toll = distance * 0.048;
	}

}
}
