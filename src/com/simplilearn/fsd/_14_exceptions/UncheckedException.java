package com.simplilearn.fsd._14_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	void process() {
		
		Scanner scan = null;
		
		int num = -1;
		int result = 0;
		
		while (num <= 0) {
			
			try {
				
				scan = new Scanner(System.in);
				
				System.out.println("Please Input a Number: ");
				
				String str = scan.next();
				
				num = Integer.valueOf(str);
				
				if ( num == 0 ) {					
                   throw new HelloException("Number cannot be Zero");
				}
				result = 100/num;
				
							
			} 
			catch(NumberFormatException | ArithmeticException | HelloException ex) {
				
				//ex.printStackTrace();
				
				System.out.println("Dear User, your input is invalid, Please try again!");
			
				//throw ex;
			}
		}

		System.out.println("The result is: " + result);	    
	}
	
	
	
	public static void main(String[] args) {

		UncheckedException obj = new UncheckedException();
		obj.process();
	
	}

}
