package com.simplilearn.fsd;

public class Variable {

	static String str3;
	
	public static void main(String[] args) {
		
		/*
		   Java has two variable types
		   1. primitive
		   2. non-primitives
		 */
		
		// Integer Data Types
		
		int a = 10; //<--- Mostly used  4 bytes 
		
		long b = Long.MAX_VALUE; // 8 bytes
		
		short c = 32767; // 2 bytes
		
		byte d = 127; // 1 byte
		
		// Decimal Data Types
		
		double e = 3.4525999999; // 8 bytes
		float  f = 3.4523123456F; // 4 bytes
		
		// Text Data Types
		
		char g = 'A';
		char[] s = {'S','i','m','p','l','i','l','e','a','r','n'};
		
		String h = "Simplilearn";
		
		boolean i = false;
		
		// As of Java 11
	    var j = 5.4;
		
		//j = "Hello";
		
		System.out.println("The value of c is " + c);
		System.out.println("The value of d is " + d);
		System.out.println("The value of e is " + e);
		System.out.println("The value of f is " + f);
		System.out.println("The value of g is " + g);
		System.out.println("The value of h is " + h);
		System.out.println("The value of s is " + new String(s));
		System.out.println("The value of i is " + i);
		
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if ( str1 == str2 ) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Different");		
		}
		
	
		System.out.println(str3);

	}
	
	

}
