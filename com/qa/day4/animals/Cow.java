package com.qa.day4.animals;

public class Cow extends Animal{
	String colour;

	@Override
	public void eat() {
		System.out.println("I'm eating grass");
	}

	@Override
	public void move() {
		System.out.println("walking slowly");
	}

	@Override
	public void noise() {
		System.out.println("MOOOOOOOOO");
	}

}
