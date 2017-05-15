package com.techelevator;

public class Airplane {
	private String  planeNumber;
	private int     bookedFirstClassSeat;
	private int     totalFirstClassSeats;
	private int 	bookedCoachSeats;
	private int 	totalCoachSeats;
	
	Airplane(String planeNumber, int
				totalFirstClassSeats, int totalCoachSeats) {
		
		this.planeNumber          = planeNumber;
		this.totalCoachSeats      = totalCoachSeats;
		this.totalFirstClassSeats = totalFirstClassSeats;
		}
	
	public void getAvailableFirstClassSeats() {
		totalFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeat;
	}
		
	public void getAvaiableCoachSeats() {
		totalCoachSeats = totalCoachSeats - bookedCoachSeats;
	}
	public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass == true) {
			bookedFirstClassSeat = totalFirstClassSeats - bookedFirstClassSeat;
		return true;
		}
		else if (forFirstClass == false) 
			bookedCoachSeats = totalCoachSeats - bookedCoachSeats;
			return false;
	}
	
		
		

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeat() {
		return bookedFirstClassSeat;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
		
		
	
	

}
