package com.qa.day4.staticexample;

// http://www.sarmaroof.com/exercise-beginner-java-static-members/
// Try to figure out what this does:

public class MyStatic {
	 
	   static int x = 6;
	   
//	   This is the constructor for the MyStatic class
	   MyStatic() {
	      x ++ ;
	   }
	   void method(){
	      System.out.print("-x" + x);
	   }
	   public static void main(String[] args){
	      
//		  The value of x doesn't increase here because the
//		  constructor isn't being called
		  MyStatic mc1,mc2,mc3,mc4;
		  
//		  Every time a new MyStatic is instantiated, the value 
//		  of x increases by one for all instances because it's static
	      MyStatic mc5 = new MyStatic();
	      MyStatic mc6 = new MyStatic();
	      MyStatic mc7 = new MyStatic();
	      mc7.method();
	   }
	}
