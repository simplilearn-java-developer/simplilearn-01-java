package com.simplilearn.fsd._01_operators._03_logical;

public class Logical {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;
		
		int c = 8;
		int d = 3;
		
		int e = 10;
		int f = 3;
		
		boolean and = (c>d) && (e<f); /* returns true only if both operands are true */
		boolean or = a || b; /* returns true only if at least one of the operands is true */
		boolean not = !a; /* returns the reverse */
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
	}

}
