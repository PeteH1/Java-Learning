package com.qa.day3.challenge;

public class Car extends Vehicle{
	
	String engineSize;
	
	public Car(int numOfWheels, int numOfDoors, String size, String speed, String engineSize) {
		super(numOfWheels, numOfDoors, size, speed);
		this.engineSize = engineSize;
	}
	
	public void vroom() {
		System.out.println("Vroom!");
	}

	@Override
	public String toString() {
		return "Car [engineSize=" + engineSize + ", numOfWheels=" + numOfWheels + ", numOfDoors=" + numOfDoors
				+ ", size=" + size + ", speed=" + speed + "]";
	}
	
//	This method has to be here because it's an abstract method in Vehicle
	@Override
	public void drive() {
		System.out.println("I'M DRIVING MY CAR");
	}
	
	

}
