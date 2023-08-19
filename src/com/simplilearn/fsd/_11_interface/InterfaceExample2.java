package com.simplilearn.fsd._11_interface;

import java.util.ArrayList;
import java.util.List;

/*
 * An Interface is like a contract that must be accomplished by
 * the class that implements the interface.
 * 
 * We declare methods in the interface that must be implemented 
 * in the class.
 */
interface Income {
	
	int NUM = 4;
	
	double calculatePay(double salary, double taxes);
	public abstract void doSomething2();
	
	static void newFeature() {
		System.out.println("This is a new feature");
	}
	
	//As of Java 8 -> default and static methods in interfaces
}

/*
 * The class is the template for creating Objects
 */
class Employee implements Income {
	
	String name;
	int age;
	
	@Override
	public double calculatePay(double salary, double taxes) {
		return salary - taxes;
	}
	
	void doSomething() {
		System.out.println("Doing Something");
	}

	@Override
	public void doSomething2() {
		System.out.println("Doing Something 2");		
	}
	
	//@Override
	public void newFeature() {
		System.out.println("This is a new feature Employee");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		
		/*
		 * We achieve abstraction by using Interfaces.
		 */
		Income emp = new Employee();
		 
		double pay = emp.calculatePay(1000,200);
		((Employee)emp).doSomething();
		
		System.out.println(pay);
		
		System.out.println(Income.NUM);
		
	
	}

}
