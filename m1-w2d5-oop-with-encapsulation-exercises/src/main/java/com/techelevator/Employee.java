package com.techelevator;

public class Employee {
	private int       employeeId;
	private String    firstName;
	private String	  lastName;
	private String    department;
	private double    salary;


	public Employee (int employeeId, String firstName, String lastName, 
			double salary) {
		this.employeeId    = employeeId;
		this.firstName     = firstName;
		this.lastName      = lastName;
		this.salary        = salary;
	}
	public String getFullName() {
		return lastName + ", " + firstName;
	}
	
	public void raiseSalary(double percent) {
		double amountOfRaise = salary * (percent / 100);
		salary = salary + amountOfRaise;
	}
		
	
	
	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public String getFirstName() {
		return firstName;
	}


	public double getAnnualSalary() {
		return salary;
	}
	



}

