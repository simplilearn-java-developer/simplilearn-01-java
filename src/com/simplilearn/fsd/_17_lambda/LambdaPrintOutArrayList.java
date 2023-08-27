package com.simplilearn.fsd._17_lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPrintOutArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("John");
		list.add("Jane");
		list.add("Mike");
		list.add("Pete");
		
		/*
		for (String str: list) {
			System.out.println(str);
		}*/
		
		//void forEach(Consumer<? super E> action) - void accept(T t)

		list.forEach(n -> { n = n + " Hello";
			                System.out.println(n);}); // Lambda Expression
		list.forEach(System.out::println); // Method Reference
		
		// SELECT * FROM USER
	
	}
}
