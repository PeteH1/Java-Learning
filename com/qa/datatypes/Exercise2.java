package com.qa.datatypes;

public class Exercise2 {

	public static void main(String[] args) {
		
		boolean boolvar = false;
		char charvar = 'H';
		byte bytevar = 3;
		short shortvar = 0;
		int intvar = 0;
		long longvar = 1L;
		float floatvar = 0.0f;
		double doublevar = 5.0D;
		
		// Initially added the charvar and bytevar as numbers to print 75 at the start, so printed in separate statements
		System.out.print(charvar);
		System.out.println(bytevar + "LL" + shortvar + " W" + floatvar + intvar + "r1d " + doublevar + " " + boolvar);
		
		System.out.println(charvar + "" + bytevar + "LL" + shortvar + " W" + floatvar + intvar + "r" + longvar + "d " + doublevar + " " + boolvar);
		
	}

}
