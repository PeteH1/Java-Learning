package com.qa.day4.animals;

public class Shark extends Animal{
	String aggression;

	@Override
	public void eat() {
		System.out.println("I'm eating people");
	}

	@Override
	public void move() {
		System.out.println("SWIMMING AROUND");
	}

	@Override
	public void noise() {
		System.out.println("What noise does a shark make?");
	}

}
