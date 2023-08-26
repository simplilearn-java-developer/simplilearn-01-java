package com.simplilearn.fsd._15_collections._01_lists;

import java.util.LinkedList;
import java.util.List;

public class StringListExample {

	/*
	 * ArrayList a Java Collection that implements the List interface.
	 * 
	 * 1. Keeps the insertion order.
	 * 2. Can hold duplicate values.
	 * 
	 * LinkedList: Uses a linked list internally. Is more efficient than ArrayList if you are going
	 * to modify the elements in the list frequently.
	 */
	
	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		
		list.add("John"); // 0
		list.add("John"); // 1
		list.add("Jane"); // 2
		list.add("Mike"); // 3
		list.add("Pete"); // 4
		list.add("Mike"); // 5
		
		
		/*
		for(String str:list) {
			System.out.println(str);
		}*/
		
		/*
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		System.out.println(list.get(5));
		
		list.add(3, "Nick");
		list.set(3, "Lily");
		
		boolean b = list.remove("Mike1");
		System.out.println(b);
		
		list.remove(0);
		list.clear();
		
		System.out.println(list);
		
		
	}
	
}
