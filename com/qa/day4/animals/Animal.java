package com.qa.day4.animals;

public abstract class Animal implements Eating, Movement{
//	Implementing interfaces means that the methods inside them
//	need to be implemented within this class. But because Animal
//	is an abstract class, the eat and move methods now only need
//	to be implemented in the subclasses of Animal
	
//	These variables are pointless at the moment without a constructor
	int lifeExpectancy;
	String size;
	int rating;
	
	public abstract void noise();
	
	public void backflip() {
		System.out.println("IMMA DOING A BACKFLIP");
	}

}
