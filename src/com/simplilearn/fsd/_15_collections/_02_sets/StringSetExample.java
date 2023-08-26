package com.simplilearn.fsd._15_collections._02_sets;

import java.util.Set;
import java.util.TreeSet;

/*
 * Set is a collection that doesn't allow duplicates
 * doesn't keep the insertion order.
 * 
 * LinkedHashSet: Keeps the insertion order, implements a LinkedList internally.
 * TreeSet: sorts the elements in the set.
 * 
 */

public class StringSetExample {

	public static void main(String[] args) {

		
		//List<String> list = new LinkedList<>();
		
		Set<String> set = new TreeSet<>();
		
		set.add("John");
		set.add("John");
		set.add("Jane");
		set.add("Mike");
		set.add("Pete");
		set.add("Mike");
		
		//set.remove("John");
		
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("Jane"));
		
	}

}
