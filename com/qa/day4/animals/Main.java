package com.qa.day4.animals;

public class Main {

	public static void main(String[] args) {
		Shark sharky = new Shark();
		
//		Abstract method noise is specified in the Shark class
		sharky.noise();
		
//		This method is from the Movement interface
		sharky.move();
		
//		This method is from the Eating interface
		sharky.eat();
		
//		This method is inherited from the Animal superclass
		sharky.backflip();
		
		
	}

}
