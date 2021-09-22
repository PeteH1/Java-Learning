package com.qa.day3.challenge;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> garageList = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}

	@Override
	public String toString() {
		return "Garage [garageList=" + garageList + "]";
	}
	
	

}
