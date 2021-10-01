package com.qa.day4.paintwizard;

import java.util.Scanner;

public class Main {
	
	
	
//	This program should work out which paint is cheapest
//	and which will result in the least waste for a given
//	room size. Instances of the Paint class need to be created
//	with a tin size, price, and coverage for each. The paint
//	class has methods that can work out the cost and waste for
//	a single paint when given a room area. Paints then
//	need to be added to the PaintList which holds the methods
//	for finding out the cheapest and least waste.

	public static void main(String[] args) {
		
		Paint cheapoMax = new Paint("Cheapo-Max", 21, 19.99, 10);
		Paint dulux = new Paint("Dulux", 40, 50, 12);
		Paint joes = new Paint("Average Joes", 16, 17.99, 11);
		Paint fancy = new Paint("Fancy Paint", 10, 25, 22);
		
		PaintList newList = new PaintList();
		newList.addPaint(cheapoMax);
		newList.addPaint(dulux);
		newList.addPaint(joes);
		newList.addPaint(fancy);		
		System.out.println(newList.toString());	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("What size area will you be painting? (in sq meters) ");
//		String userArea = scan.nextLine();
		
		int myRoomArea = 750;
		
		System.out.println(newList.leastWaste(myRoomArea).getName());
		System.out.println(newList.lowestCost(myRoomArea).getName());
		
//		System.out.println(fancy.getName());
//		System.out.println("Number of tins = " + fancy.getNumOfTins(myRoomArea));
//		System.out.println("Total cost = " + fancy.getCost(myRoomArea)); 
//		System.out.println("Amount wasted in litres = " + fancy.getWaste(myRoomArea));
//		
//		System.out.println("\n ======================================== \n");

	}

}
