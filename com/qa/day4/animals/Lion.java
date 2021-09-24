package com.qa.day4.animals;

public class Lion extends Animal{
	boolean isHungry;

	@Override
	public void eat() {
		System.out.println("I'm eating gazelles");
	}

	@Override
	public void move() {
		System.out.println("I'M RUNNING AROUND");
	}

	@Override
	public void noise() {
		System.out.println("RRRROOOOOOOAAAAARRRR");
	}

}
