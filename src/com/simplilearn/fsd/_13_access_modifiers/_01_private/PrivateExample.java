package com.simplilearn.fsd._13_access_modifiers._01_private;

/*
 * Private is an access modifier that can only be applied for 
 * attributes, constructors and methods.
 * 
 * private members are visible within the class only.
 * private members are not inherited
 */


class MyClass{

	private int num;
		
	int getNum() {
		return num;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
//	private MyClass(){
//		
//	}
	

	void printClass() {
		// do another things first
		this.print();
	}

	private void print() {
		System.out.println("MyClass: " + this.num);
	}
}

class MyChild extends MyClass {
	
	void doSomething() {
		
		this.setNum(4);
		System.out.println(this.getNum());
	}
}


public class PrivateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyClass obj = new MyClass();
		//obj.num = 4;
		
		//Math.pow(2, 3);
		
		//obj.printClass();
		
		MyChild obj = new MyChild();
		obj.doSomething();
		
	}

}
