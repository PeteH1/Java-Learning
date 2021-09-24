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
	
//	This method has to be here because it's an abstract method in Vehicle
	@Override
	public void drive() {
		System.out.println("I'M DRIVING MY MOTORBIKE");
	}
	
	

}
