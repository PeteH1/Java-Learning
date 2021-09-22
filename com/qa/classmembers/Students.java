package com.qa.classmembers;

public class Students {
	
	String name = "Bob";
	byte age = 10;
	double height;
	long studentId = (long)(Math.random() * 100000000);
	boolean highIq = false;
	
	public void doHomework() {
		System.out.println("I'm doing my homework");
	}
	
	public int addNumbers(int x, int y) {
		
		int z = x + y;
		
		return z;
		
	}

}
