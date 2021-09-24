package com.qa.day3.challenge;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicle> garageList = new ArrayList<>();
	
	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}
	
	public void getBill() {
		for (Vehicle i : garageList) {
			System.out.println(i.getClass().getSimpleName());
			if (i.getClass().getSimpleName().equals("Car")) {
				System.out.println("The bill for your car is £10");
			} else if (i.getClass().getSimpleName().equals("Motorbike")) {
				System.out.println("The bill for your motorbike is £5");
			} else {
				System.out.println("The bill for your van is £8,000,000");
			}
		}
	}
	
//	For each loop doesn't work - need to make this a normal for loop
//	public void removeVehicleOfType(String type) {
//		for (Vehicle i : garageList) {
//			if (i.getClass().getSimpleName().equals(type)) {
//				garageList.remove(i);
//			}
//		}
//	}

	@Override
	public String toString() {
		return "Garage [garageList=" + garageList + "]";
	}
	
	

}
