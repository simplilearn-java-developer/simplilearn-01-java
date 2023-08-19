package com.simplilearn.fsd._12_abstract_class;


/*
 * An abstract class is a class that can only be extended
 * 
 * Allows us to declare abstract methods to be defined in the Child Class.
 * 
 */
abstract class MyAbstractClass {
	
	abstract void print();
	
	void printHello() {
		System.out.println("Hello");
	}
}

class Child extends MyAbstractClass {

	@Override
	void print() {
		System.out.println("I am a Child");
	}
	
	void doSomething() {
		System.out.println("Doing Something");
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {

		MyAbstractClass obj = new Child();
		
		obj.print();
		obj.printHello();
		//obj.doSomething();
	}

}
