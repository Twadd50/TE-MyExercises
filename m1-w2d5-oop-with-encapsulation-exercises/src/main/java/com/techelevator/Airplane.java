package com.techelevator;

public class Airplane {
	private String  planeNumber;
	private int     bookedFirstClassSeats;
	private int     totalFirstClassSeats;
	private int 	bookedCoachSeats;
	private int 	totalCoachSeats; 
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		
		this.planeNumber          = planeNumber;
		this.totalCoachSeats      = totalCoachSeats;
		this.totalFirstClassSeats = totalFirstClassSeats;
		}
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
		
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	public boolean reserveSeats (boolean forFirstClass, int totalNumberOfSeatsRequested) {
		if (forFirstClass == true) {
			if (totalNumberOfSeatsRequested > totalFirstClassSeats - bookedFirstClassSeats) {
				return false;
			} else {
				bookedFirstClassSeats = bookedFirstClassSeats + totalNumberOfSeatsRequested;
				return true;
			}	
		
		} else {
			if(totalNumberOfSeatsRequested > totalCoachSeats - bookedCoachSeats) {
				return false;
			} else {
				bookedCoachSeats = bookedCoachSeats + totalNumberOfSeatsRequested;
				return true;
			}
			
		}
	}	
		

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
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
