package com.qa.day3.challenge;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car(4, 5, "medium", "terrifyingly fast", "1.4");
		Van myVan = new Van(4, 3, "big", "slow", "loads");
		Motorbike myBike = new Motorbike(2, 0, "small", "fast", false);
		
		Garage myGarage = new Garage();
		myGarage.addVehicle(myCar);
		myGarage.addVehicle(myVan);
		myGarage.addVehicle(myBike);
		
		System.out.println(myGarage.toString());
		
	}

}
