package com.qa.day3.encapsulation.model;

public class Car {
	private int numOfWheels;
	private String make;
	private String model;
	private String colour;
	private boolean hasSunRoof;
	
	// Autogenerate constructor: right-click > Source > Generate Constructor using Fields...
	public Car(int numOfWheels, String make, String model, String colour, boolean hasSunRoof) {
		this.numOfWheels = numOfWheels;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.hasSunRoof = hasSunRoof;
	}

	public Car(int numOfWheels, String make, String model, boolean hasSunRoof) {
		this.numOfWheels = numOfWheels;
		this.make = make;
		this.model = model;
		this.colour = "Blue";
		this.hasSunRoof = hasSunRoof;
	}

	public Car() {}
	
	// Autogenerate Getters and Setters: right-click > Source > Generate Getters and Setters
	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isHasSunRoof() {
		return hasSunRoof;
	}

	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}

	// Autogenerate toString using right-click > Source etc.
	@Override
	public String toString() {
		return "Car [numOfWheels=" + numOfWheels + ", make=" + make + ", model=" + model + ", colour=" + colour
				+ ", hasSunRoof=" + hasSunRoof + "]";
	}
	
	
	
	
	
	

}
