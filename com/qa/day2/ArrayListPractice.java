package com.qa.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(9001);
		numbers.add(42);
		numbers.add(555);
		Collections.sort(numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		

	}

}
