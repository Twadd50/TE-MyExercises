package com.techelevator;
	
	public class 	PostalService implements DeliveryDriver {
		private int	postalClass;
		public PostalService(int postalClass) {
			this.postalClass = postalClass;
		}
		public double calculateRate(int distance, int weight) {
			return 0.0;
		}		
}
