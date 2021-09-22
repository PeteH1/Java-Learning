package com.qa.datatypes;

public class NumbersAndWords {

	public static void main(String[] args) {
		
		int number1 = 9001;
		int number2 = 101;
		
		int adding = Numbers.addition(number1, number2);
		System.out.println(adding);
		
		int product = Numbers.product(number1, number2);
		System.out.println(product);
		
		boolean test  = Numbers.isEven(number1);
		System.out.println(test);
		
		double divVar = Numbers.division(number2, number1);
		System.out.println(divVar);
		
		String word1 = "hats ";
		String word2 = "and cats";
		
		String wordcombo = Words.combine(word1, word2);
		System.out.println(wordcombo);
		
		String name = "Pete Hutchison";
		
		String reverseName = Words.reverse(name);
		System.out.println(reverseName);

	}

}
