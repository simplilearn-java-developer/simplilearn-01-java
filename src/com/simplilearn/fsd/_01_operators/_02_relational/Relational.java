package com.simplilearn.fsd._01_operators._02_relational;

public class Relational {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		/* We should ONLY use relational operators with primitives */
		
		boolean equalTo = a==b; /* Equal To Operator*/
		boolean notEqual = a!=b; /* Not Equal To Operator*/
		boolean gterThan = a > b; /* Not Equal To Operator*/
		boolean lessThan = a < b; /* Not Equal To Operator*/
		boolean gThanEqu = a >= b; /* Not Equal To Operator*/
		boolean lThanEqu = a <= b; /* Not Equal To Operator*/
		
		
		System.out.println("Equal To " + equalTo);
		System.out.println("Not Equal To " + notEqual);
		System.out.println("Greater Than " + gterThan);
		System.out.println("Less Than " + lessThan);
		System.out.println("Greater than Equal " + gThanEqu);
		System.out.println("Less than Equal " + lThanEqu);
	
		String s1 = new String("Hello");
		String s2 = new String("Hello");
	
		/* 
		 * Java thinks you want to compare the memory address 
		 * of the non-primitive variables.
		 */
		
		boolean bstr = s1==s2;
		System.out.println(bstr);
	}
}
