package com.qa.day3.encapsulation;

import com.qa.day3.encapsulation.model.Car;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		//Cars
		Car ford = new Car(4, "Ford", "Galaxy", "Black", false);
		
		ford.setNumOfWheels(9000);
		
		System.out.println(ford.toString());
		
		//People
		Person pete = new Person("Pete", 27, "CEO of Pete Industries");
		Person liz = new Person("Elizabeth Windsor", 95, "Queen of UK & Commonwealth");
		Person rick = new Person("Rick Astley", 55, "Singer");
		
		//Maybe better to create the list in a separate "PersonList" class where you can
		//create methods for adding people and searching through the list etc.  ...?
		List<Person> people = new ArrayList<>(Arrays.asList(pete, rick, liz));
		
		
		
		
		System.out.println(people);
		
		
		

	}

}
