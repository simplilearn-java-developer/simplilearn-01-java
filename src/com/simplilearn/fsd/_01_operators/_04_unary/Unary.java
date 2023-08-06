package com.simplilearn.fsd._01_operators._04_unary;

public class Unary {

	public static void main(String[] args) {

		int a = 4;
		
		// Post Increment
		
		int b = a++;
		
		System.out.println("a= " + a );
		System.out.println("b= " + b );

		// Pre Increment
		
		a = 4;	
		b = ++a;
		
		System.out.println("a= " + a );
		System.out.println("b= " + b );

		a = 4;
		
		// Post Decrement
		
		b = a--;
		
		System.out.println("a= " + a );
		System.out.println("b= " + b );
		
		// Pre Decrement
		
		a = 4;	
		b = --a;
		
		System.out.println("a= " + a );
		System.out.println("b= " + b );
		
	}

}
