package com.simplilearn.fsd._02_flow_control._03_while_loop;

public class WhileLoop {

	public static void main(String[] args) {

		
		int i = 0;
		
		
		while (i < 10) {
		
			i++;

			if (i==5) {
				continue;
			}

			System.out.println(i);
			//i= i + 2;
			
			//i+= 2;
			
		}
		
		/*
		do {
			System.out.println(i);
            i++;			
		} while (i<10);
		*/
	}

}
