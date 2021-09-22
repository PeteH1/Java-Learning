package com.qa.day3.inheritance;

public class Siamese extends /* is a */ Cat{
	
	public void scratch() {
		System.out.println("Scratch attack");
	}
	
	@Override
	public void meow() {
		System.out.println("I'm a regal cat, I don't meow");
	}

}
