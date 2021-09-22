package com.qa.day2;

public class Main {

	public static void main(String[] args) {
		
		int num1 = 21;
		int num2 = 20;
		int num3 = 19;
		
		int result = Blackjack.play(num1, num2);
		System.out.println(result);	
		
		int sumCheck = UniqueSum.sum(num1, num2, num3);
		System.out.println(sumCheck);
		
	}
	
}
