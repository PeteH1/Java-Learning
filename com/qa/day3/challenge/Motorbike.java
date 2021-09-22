package com.qa.day3.challenge;

public class Motorbike extends Vehicle{
	
	boolean isRacing;

	public Motorbike(int numOfWheels, int numOfDoors, String size, String speed, boolean isRacing) {
		super(numOfWheels, numOfDoors, size, speed);
		this.isRacing = isRacing;
	}

	@Override
	public String toString() {
		return "Motorbike [isRacing=" + isRacing + ", numOfWheels=" + numOfWheels + ", numOfDoors=" + numOfDoors
				+ ", size=" + size + ", speed=" + speed + "]";
	}
	
	

}
