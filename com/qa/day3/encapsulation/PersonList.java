package com.qa.day3.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    
    List<Person> personList = new ArrayList<>();
    
    public void addPerson(Person person) {
        personList.add(person);
    }
    
    //Maybe change this to return a person rather than print...?
    public void getPersonFromList(String name) {
    	
    	for (Person i : personList) {
			if (i.getName() == "Pete") {
				System.out.println(i);
			}
		}
		}
    
    public List<Person> getPersonList() {
        return personList;
    }
  
}