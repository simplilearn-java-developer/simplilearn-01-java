package com.simplilearn.fsd._08_super;


/*
 * The super keyword is a reference variable that refers the immediate 
 * parent class.
 */
class Parent{
	
	String color = "Parent color";
	
//	Parent(){
//		System.out.println("Parent Constructor");
//	}
	
	Parent(String color){
		this.color = color;
		System.out.println("Parent Constructor");
	}
	
	void doSomething() {
		System.out.println("Parent Doing Something");
	}
	
}

class Child extends Parent{
	
	String color = "Child color";
	
    Child(){
    	super("new Color");
    	System.out.println("Child Constructor");
    }
	
	void displayColor() {
		System.out.println(this.color);
		System.out.println(super.color);
	}

	@Override
	void doSomething() {
		System.out.println("Child Doing Something");
		super.doSomething();
	}
}


public class SuperKeyword {

	public static void main(String[] args) {

		Child obj = new Child();
		
		obj.displayColor();
		obj.doSomething();
	}

}
