package com.simplilearn.fsd._13_access_modifiers._01_private;

/*
 * Private is an access modifier that can only be applied for 
 * attributes, constructors and methods.
 */


class MyClass{

	private int num;
	
	void print() {
		System.out.println("MyClass: " + this.num);
	}
}

public class PrivateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass obj = new MyClass();
		//obj.num = 4;
		
	}

}
