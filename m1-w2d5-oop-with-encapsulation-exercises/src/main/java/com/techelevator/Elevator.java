package com.techelevator;

public class Elevator {
	private int 	currentFloor;
	private int  	numberOfFloors;
	private boolean doorOpen;

	public Elevator(int totalNumberOffloors) {
		this.currentFloor   = 1;
		this.numberOfFloors = totalNumberOffloors;
		doorOpen      	    = false;										 
	}
	public void openDoor() {
		if (doorOpen == false)
			doorOpen = true;
		}
	public void closeDoor() {
		if (doorOpen == true)
			doorOpen = false;
	}
	public void goUp (int desiredFloor) {
		if((doorOpen == false) && (desiredFloor < numberOfFloors))
			desiredFloor = 	numberOfFloors + currentFloor;					 ?
	}
	public void goDown(int desiredFloor) {
		if ((doorOpen == false) && (desiredFloor > numberOfFloors))
			desiredFloor += currentFloor--;									 ?
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean isDoorOpen() {
		return doorOpen;
	}
	

	
	
	
	
	
}
