package com.simplilearn.fsd._06_overloading;


/*
 * Overloading
 * Is the situation where in the same class, two or more methods/constructors
 * have the same name but different parameters.
 */

class MyClass{
	
	int num;
	String str;
	
	/*
	 * Overload constructors
	 */
	
	MyClass() {	
	}

	MyClass(int num) {
		this.num = num;
	}


	MyClass(String str) {
		this.str = str;
	}

	MyClass(int num, String str) {
		this.num = num;
		this.str = str;
	}
	
	/*
	 * Method Overloading
	 */
	
	// concatenate String int
	String concatenate(String str, int num) {
		return str + " " + num;
	}

	// concatenate int String
	String concatenate(int num, String str) {
		return num + " " + str;
	}
	
	// concatenate String
	String concatenate(String str) {
		return "Hello" + str;
	}
	
}

public class Overloading {

	public static void main(String[] args) {

		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass(10);
		MyClass obj3 = new MyClass("Hello");
		MyClass obj4 = new MyClass(1,"Hello");
		
		System.out.println(obj1.concatenate("Hello", 1));
		System.out.println(obj1.concatenate(1,"Hello"));
		System.out.println(obj1.concatenate("Hello"));
		
	}

}
