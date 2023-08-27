package com.simplilearn.fsd._15_collections._03_maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class IntegerStringMapExample {

	/*
	 * A Collection of elements in a key-value format.
	 * The elements are indexed by key.
	 * 
	 * It doesn't allow duplicate keys.
	 * It doesn't keep the insertion order.
	 * 
	 * We use map for searching in memory. 
	 * Time Complexity - O(1) - Constant.
	 * 
	 * Implement Hash Algorithm
	 * 
	 * LinkedHashMap - Keeps the insertion order.
	 * TreeMap - Sorts the map by keys.
	 */
	
	public static void main(String[] args) {

		Map<Integer,String> map = new TreeMap<>();
		
		map.put(2001, "John");
		map.put(4157, "Jane");
		map.put(2001, "Nick");
		map.put(9342, "Pete");
		map.put(6731, "Mike");
		map.put(9343, "Nick");
		
		System.out.println(map);
		
		System.out.println(map.get(6731));
		System.out.println(map.size());
		System.out.println(map.containsKey(2001));
		System.out.println(map.get(6732));
		
		for(Entry<Integer,String> entry: map.entrySet()) {
			System.out.println( entry.getKey() + " , " + entry.getValue());
		}
	}

}
