package com.simplilearn.fsd._13_access_modifiers._03_protected.same_package;

/*
 * The protected access modifier only applies to properties and methods.
 * It access modifier is the same as the default access modifier but we
 * have access to the members in other packages through inheritance.
 * 
 */
public class MyClass {

	protected int num = 4;
	
	protected void doSomething() {
		System.out.println("Doing Something");
	}
}
