package com.techelevator.company;

public class Company{
	
	
		private int    numberOfEmployees;
		private double revenue;
		private double expenses;
		public String  name;
		
		
		public String getCompanySize() {
			if (numberOfEmployees  <=  50) {
				return "small";
			}
			
			else if (numberOfEmployees   >=  51  &&  numberOfEmployees  <=  250) {
				return "medium";
			}
		
			else if (numberOfEmployees  >  250) {
				return "large";
				
			}
			else return null;
			
		}
			
			
			public double getProfit() {
				return revenue  -  expenses;
		}
	
	
	
		
	

	
	
	
	
	
	

	public int getNumberOfEmployees() { 				// method name 
		return numberOfEmployees;
	}
	
	
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	public double getRevenue() {
		return revenue;
	}
	
	
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	
	public double getExpenses() {
		return expenses;
	}
	
	
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	 {
		
	}
}
