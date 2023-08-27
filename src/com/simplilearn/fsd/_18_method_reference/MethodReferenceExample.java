package com.simplilearn.fsd._18_method_reference;

@FunctionalInterface
interface Sayable {
	void say();
}

@FunctionalInterface
interface Sayable2 {
	void say(String str);
}

class MyClass {
	
	static void saySomething() {
		System.out.println("Hello, this is a method()");
	}

	void saySomething2() {
		System.out.println("Hello, this is a method2()");
	}
}

public class MethodReferenceExample {

	public static void main(String[] args) {

		/* Reference to a static method */
		Sayable obj1 = MyClass::saySomething;
		
		obj1.say();
		
        // System.out.println(String str)
		
		Sayable2 obj2 = System.out::println;
		
		obj2.say("Hello");

		/* Reference to a non-static method */
		
		MyClass myObj = new MyClass();
		
		Sayable obj3 = myObj::saySomething2;

		Sayable obj4 = new MyClass()::saySomething2;
		
		
	}

}
