package com.qa.day4.staticexample;

//http://www.sarmaroof.com/exercise-beginner-java-static-members/

public class StaticMember {
	 
	   static int x;
	   int y;
	 
//	   This is the constructor for the StaticMember class
	   StaticMember() {
	      x += 2;
	      y ++ ;
	   }
	   static int getSquare(){
	      return x * x;
	   }
	   public static void main(String[] args){
	      StaticMember sm1 = new StaticMember();
	      StaticMember sm2 = new StaticMember();
//	      The value of x is now 4 because the constructor has been
//	      called twice and x is static (0 + 2 + 2).
//	      y equals 1 for each instance because it's not static
	      
	      
	      int z = sm1.getSquare();
	      System.out.print("-x" + z + "-y" + sm2.y);
	   }
	}
