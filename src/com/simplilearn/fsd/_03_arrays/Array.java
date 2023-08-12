package com.simplilearn.fsd._03_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {

		int i0 = 4;
		int i1 = 5;
		int i2 = 7;
		int i3 = 2;
		int i4 = 14;
		int i5 = 35;
		int i6 = 46;
		int i7 = 71;
		int i8 = 28;
		int i9 = 19;

		int[] array = { 4, 5, 7, 2, 14, 35, 46, 71, 28, 19, 100, 102 };
		//              0  1  2  3   4   5   6   7   8   9, 10, 11
		
		int[] array2 = new int[1000];
		
		List<Integer> list = new ArrayList<>();
		list.size();

		array[4] = 91;
		array[array.length-1] = 67; 
		
		System.out.println(Arrays.toString(array));
		
		/*
		for (int num: array) {
			System.out.print(num + "\n");
		}*/
		
		for (int i=0; i< array.length ; i++) {
			System.out.println(array[i]);
		}
		
		//System.out.println(array[5]); 
	
		//int[] a;
		
		// get data from the database;
		
		//int size = 20; // get the size from rs.size()
		
		//a = new int[size];
		
		String[] brands = { "Toyota", "Ford", "Nissan", "BMW" };
		
		String[] d = new String[4];
		d[0] = "John";
		d[1] = "Jane";
		
		System.out.println(Arrays.toString(d));
		
		int[][] e = { {3,4}, 
				      {5,6,4,45} ,
				      {-1,4} };
//		                 0      1 
 		System.out.println(e[2][0]);
 		
 		/*
 		for (int i=0; i<e.length; i++) {
 			for(int j=0; j<e[i].length; j++) {
 				System.out.print(e[i][j] + ",");
 			}
 			System.out.print("\n");
 		}*/

 		for (int i=0; i<e.length; i++) {
 			System.out.println(Arrays.toString(e[i]));
 		}
		
		
		
	
	}

}
