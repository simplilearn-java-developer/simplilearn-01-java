package com.simplilearn.fsd._05_oop;

/*
 * 1. Attributes
 * 2. Constructors
 * 3. Methods
 */

class Employee {
	
	/*
	 * Attributes, Properties, Fields, Instance Variables
	 */
	private int id;
	private String name;
    private double salary;
	private String position;
	
	/*
	 * A Constructor is a special method that is used to initialize objects.
	 * It is called automatically when we create the object.
	 * 
	 * Types:
	 * 1. Default Constructor: Created automatically by Java if the class doesn't have
	 *                         any constructor.
	 * 2. No-Arg Constructor: A constructor that takes no parameters
	 * 3. Parameterized Constructor: A constructor that takes parameters
	 */
	
	Employee(){
		this.id = 0;
		this.name = "";
		this.salary = 0.0;
		this.position = "";
	}
		
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	/* Mutators - Getters and Setters */
	
	int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	double getSalary() {
		return salary;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	String getPosition() {
		return position;
	}
	
	void setPosition(String position) {
		this.position = position;
	}
	
	
	/*
	 * Method is a block of code that runs when it is called.
	 * 
	 * return type - method name - parameters - block of code
	 */
	
	void display() {
		System.out.println("Id: " + id);
		System.out.println("name: " + name);
		System.out.println("salary: " + salary);
		System.out.println("position: " + position);
	}
	

	/*
	 * Method declaration - Method Signature (method name, parameter types)
	 * Method body
	 */
	double calculateBonus(double percentage) {
		
		double empBonus = salary * percentage / 100;
		
		/*
		 * Send the value to the DB
		 */
		
		return empBonus;
	}

	
}

public class MyClass {

	public static void main(String[] args) {

		/* Emp 1*/

		Employee emp1 = new Employee(); /* Object or Instance of class Employee*/
		
//		emp1.id = 1020; /* Breaking OOP Concept - Encapsulation */
//		emp1.name = "John";
//		emp1.salary = 80000;
//		emp1.position = "Manager";
		
		emp1.display();
		
		double bonus = emp1.calculateBonus(10);
		
		System.out.println("Bonus: " + bonus);
				
		/* Emp 2*/

		Employee emp2 = new Employee();
		emp2.setId(1030); /* Encapsulation OOP - Concept*/
        emp2.setName("Jane");
        emp2.setSalary(100000);
        emp2.setPosition("Director");
        
        emp2.display();
        
        bonus = emp2.calculateBonus(5);
        
        System.out.println("Bonus: " + bonus);
        
        /* Emp 3*/
        
        Employee emp3 = new Employee(1040,"Mike",90000,"Accountant");
        
        emp3.display();
        
        bonus = emp3.calculateBonus(5);
        
        System.out.println("Bonus: " + bonus);

        /* Emp 4*/
        
        Employee emp4 = new Employee(1050,"Hello");
        emp4.setSalary(100000);
        emp4.setPosition("Director");
	}
	
}
