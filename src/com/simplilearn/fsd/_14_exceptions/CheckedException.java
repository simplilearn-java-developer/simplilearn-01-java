package com.simplilearn.fsd._14_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Checked Exceptions don't inherit from RuntimeException as Unchecked exceptions do.
 * 
 * Options:
 * 
 * 1. Handle the Checked Exception
 * 2. Throw the exception up to the caller.
 * 
 */


public class CheckedException {

	void process() {
	
		// 1. Open the file.
		// 2. Read the file line by line.
		// 3. Close the file.
		
		BufferedReader file = null;
		
		try {
			file = File.open("testfile.txt",true);
			
			String line = null;
			
			while((line = File.read(file))!=null) {
				System.out.println(line);
			}
			
		} 
		catch (FileNotFoundException ex) {
			System.out.println("Dear User, the file doesn't exist!");
			ex.printStackTrace();
		}
		catch (IOException ex) {
			
			System.out.println("Dear User, error while reading the file!");
			ex.printStackTrace();
		}
		finally {
			
			System.out.println("Finally block is always executed!");
			File.close(file);
		}
			
	}

	void process2() throws FileNotFoundException, IOException {
		
		// 1. Open the file.
		// 2. Read the file line by line.
		// 3. Close the file.
		
		BufferedReader file = null;
		
		try {
			file = File.open("testfile.txt",true);
			
			String line = null;
			
			while((line = File.read(file))!=null) {
				System.out.println(line);
			}		
		} 
		finally {
			
			System.out.println("Finally block is always executed!");
			File.close(file);
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		CheckedException obj = new CheckedException();
		obj.process();
		

		obj.process2();
			

	}

}
