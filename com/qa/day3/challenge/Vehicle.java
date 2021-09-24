package com.qa.day3.challenge;

public abstract class Vehicle {
	
	int numOfWheels;
	int numOfDoors;
	String size;
	String speed;
	
	public Vehicle(int numOfWheels, int numOfDoors, String size, String speed) {
		super();
		this.numOfWheels = numOfWheels;
		this.numOfDoors = numOfDoors;
		this.size = size;
		this.speed = speed;
	}
	
//	Abstract method means that "drive" method has to be
//	implemented in child classes
	public abstract void drive();

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [numOfWheels=" + numOfWheels + ", numOfDoors=" + numOfDoors + ", size=" + size + ", speed="
				+ speed + "]";
	}
	
	
	

}
