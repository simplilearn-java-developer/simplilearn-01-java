package com.simplilearn.fsd._11_interface;

/*
 * An Interface is like a contract that must be accomplished by the class that 
 * implements the interface.
 */
interface MyInterface {
	
	void doSomething();
}

interface AnotherInterface extends MyInterface {
	
	void doSomething2();
}

class MyClass implements MyInterface {

	@Override
	public void doSomething() {
		System.out.println("Class is doing something");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		
		obj.doSomething();
	}

}
