package com.simplilearn.fsd._02_flow_control._01_if_statement;

public class IfStatement {


	
	public static void main(String[] args) {

		int x = 20;
		int y = 18;
		
		if (x > y) {
			System.out.println("x is greater than y ");
		} 
		else if (x < y) {
			System.out.println("y is greater than x ");					
		}
		else {
			System.out.println("y is equal to x ");			
		}
		
		System.out.println("************");
		
		if (x > y) {
			System.out.println("x is greater than y ");
		} 
		if (x < y) {
			System.out.println("y is greater than x ");					
		}
		if (x==y) {
			System.out.println("y is equal to x ");			
		}
		
		/* Ternary Operator */
		
		String result = "";
		
		if (x > y) {
			result = "x is greater than y";
		} 
		else {
			result = "y is greater than x";			
		}
		
		result = (x > y) ? "x is greater than y" : "y is greater than x"; 
		
		System.out.println("Ternary Operator: " + result);
	}

}
