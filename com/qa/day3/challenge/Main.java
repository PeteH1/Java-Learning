package com.qa.day3.challenge;

public class Main {

	public static void main(String[] args) {
		
		Vehicle myCar = new Car(4, 5, "medium", "terrifyingly fast", "1.4");
		Vehicle myVan = new Van(4, 3, "big", "slow", "loads");
		Vehicle myBike = new Motorbike(2, 0, "small", "fast", false);
		
		Garage myGarage = new Garage();
		myGarage.addVehicle(myCar);
		myGarage.addVehicle(myVan);
		myGarage.addVehicle(myBike);
		
		System.out.println(myGarage.toString());
		
		myGarage.getBill();
		
//		Because we created myCar using "Vehicle myCar.." we need to do 
//		this casting to use the methods from Car
//		Otherwise we can only use Vehicle methods
		((Car) myCar).vroom();
		
//		Need to fix this method first
//		myGarage.removeVehicleOfType("Car");
		
		System.out.println(myGarage.toString());
	}

}
