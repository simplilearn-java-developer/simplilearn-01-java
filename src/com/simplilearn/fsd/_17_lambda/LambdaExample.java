package com.simplilearn.fsd._17_lambda;

@FunctionalInterface
interface Sayable{
	String say();
}

@FunctionalInterface
interface Sayable2{
	String say(String str);
}

@FunctionalInterface
interface Addable {
	int add(int a, int b);
}

class MyClass implements Sayable, Sayable2{

	@Override
	public String say() {
		return "I love Java";
	}

	@Override
	public String say(String str) {
		return "I love Java - " + str;
	}	
}

public class LambdaExample {

	/*
	 * Lambda expression is a clear an concise way to implement Functional Interface.
	 * In other words, lambda expressions create anonymous methods.
	 * 
	 * Lambda Expression Components:
	 * 
	 * 1. List of Parameters
	 * 2. Arrow Token
	 * 3. Body
	 */
	public static void main(String[] args) {

		MyClass obj1 = new MyClass();
		System.out.println(obj1.say());
		
		/* Lambda Expression with no parameters */
		Sayable obj2 = 	() -> {
			               return "I love Java";
		                };
		
		Sayable obj3 = () -> "I love Java";		                
		                
		System.out.println(obj2.say());                
		System.out.println(obj3.say()); 
		
		System.out.println(obj1.say("Simplilearn"));
		

		/* Lambda Expression with one parameter */
		
		Sayable2 obj4 = (String str) -> {
			                   return "I love Java - " + str;
		                 };
		                 
		Sayable2 obj5 = str -> "I love Java - " + str;
		
		System.out.println(obj5.say("Simplilearn")); 
		
		/* Lambda Expression with two parameters*/
		
		//int add(int a, int b);
		Addable obj6 = (int a, int b) -> {
			                               return a + b;
 		                                 };
				
	    hello(obj6);                 
	}
	
	static void hello(Addable o) {
	     System.out.println(o.add(6, 7));	
	}

}
