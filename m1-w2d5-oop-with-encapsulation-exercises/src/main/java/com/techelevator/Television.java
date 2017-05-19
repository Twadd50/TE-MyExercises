package com.techelevator;

public class Television {
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;

	
	
	public Television() {
		isOn = false;
		currentChannel = 3;
		currentVolume = 2;
}
	public void turnOff() {
		if (isOn == true)
			isOn = false;
}
	public void turnOn() {
		if (isOn == false)
			isOn = true;
}
	public void changeChannel(int newChannel) {
		if ( isOn == true)
			if ( newChannel>= 3 && newChannel<= 18)
				currentChannel = newChannel;
	}
	public void channelUp() {
		if (isOn == true)
			currentChannel++;
			if (currentChannel > 18)
				currentChannel = 3;
	}
	public void channelDown() {
		if (isOn == true)
			currentChannel--;
			if (currentChannel < 3)
				currentChannel = 18;
	}
	public void raiseVolume() {
		if( isOn == true && currentVolume < 10) {
			currentVolume = currentVolume + 1;
		}
	}
	public void lowerVolume() {
		if(isOn == true && currentVolume > 0) {
			currentVolume = currentVolume -1;
		} 
		
	}
	


	public boolean isOn() {
		return isOn;
	}



	public int getCurrentChannel() {
		return currentChannel;
	}



	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	
}
