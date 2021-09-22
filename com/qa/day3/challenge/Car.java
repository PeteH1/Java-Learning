package com.qa.day3.challenge;

public class Car extends Vehicle{
	
	String engineSize;
	
	public Car(int numOfWheels, int numOfDoors, String size, String speed, String engineSize) {
		super(numOfWheels, numOfDoors, size, speed);
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Car [engineSize=" + engineSize + ", numOfWheels=" + numOfWheels + ", numOfDoors=" + numOfDoors
				+ ", size=" + size + ", speed=" + speed + "]";
	}
	
	

}
