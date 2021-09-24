package com.qa.day4.animals;

public class Bird extends Animal{
	String wingspan;

	@Override
	public void eat() {
		System.out.println("I'm eating worms");	
	}

	@Override
	public void move() {
		System.out.println("I'M FLYING");	
	}

	@Override
	public void noise() {
		System.out.println("BIRD NOISES!!!!!1!!");		
	}
	
	

}
