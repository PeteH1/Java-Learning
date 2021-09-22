package com.qa.datatypes;

public class Words {
	
	public static String combine(String a, String b) {
		String z = a + b;
		return z;
	}
	
	public static String reverse(String input) {
		char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}

}
