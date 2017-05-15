package com.techelevator.shoppingcart;

public class ShoppingCart {

	private int    totalNumberOfItems;
	private double totalAmountOwed;
	
	public double getAveragePricePerItem() {
		return totalAmountOwed /totalNumberOfItems; 
	}
		
		public void addItems (int numberOfItems, double pricePerItem) {
			totalNumberOfItems = (int) (pricePerItem * numberOfItems);
		}
		
		
	public void empty() {
		totalAmountOwed = 0;	
	}
	
				
	
	
	
	
	
	
	
	
	
	
	public int geTotalNumberOfitems() {
		return totalNumberOfItems;
	}
	public void setTotalNumberOfitems(int totalNumberOfitems) {
		this.totalNumberOfItems = totalNumberOfitems;
	}
	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	public void setTotalAmountOwed(int totalAmountOwed) {
		this.totalAmountOwed = totalAmountOwed;
	}
	
}
