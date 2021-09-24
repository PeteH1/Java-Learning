package com.qa.day3.challenge;

public class Van extends Vehicle{
	
	String storage;

	public Van(int numOfWheels, int numOfDoors, String size, String speed, String storage) {
		super(numOfWheels, numOfDoors, size, speed);
		this.storage = storage;
	}

	@Override
	public String toString() {
		return "Van [storage=" + storage + ", numOfWheels=" + numOfWheels + ", numOfDoors=" + numOfDoors + ", size="
				+ size + ", speed=" + speed + "]";
	}
	
//	This method has to be here because it's an abstract method in Vehicle
	@Override
	public void drive() {
		System.out.println("I'M DRIVING MY VAN");
	}
	

}
