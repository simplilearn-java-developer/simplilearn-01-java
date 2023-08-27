package com.simplilearn.fsd._19_stream;

import java.util.ArrayList;
import java.util.List;

class Product {
	
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s]", id, name, price);
	}
		
}


public class StreamExample {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		//Product product = new Product(1,"HP Laptop", 25000);
		
		products.add(new Product(1,"HP Laptop", 25000));
		products.add(new Product(2,"Dell Laptop", 30000));
		products.add(new Product(3,"Lenovo Laptop", 28000));
		products.add(new Product(4,"Sony Laptop", 28000));
		products.add(new Product(5,"Apple Laptop", 90000));
		
		/*
		 * Create a List of prices smaller than 30,000
		 */

		/*
		 * Imperative Programming (OOP)
		 */
		
		List<Double> prices = new ArrayList<>();
		
		for (Product product: products) {
			
			if ( product.getPrice() < 30000 ) {
				prices.add(product.getPrice());
			}
		}
		
		System.out.println(prices);

		/*
		 * Functional Programming
		 */
		
		// Stream<T> filter(Predicate<? super T> predicate) - boolean test(T t)
		// R apply(T t)
		prices = products.stream()
				           .filter(p -> p.getPrice() < 30000)
				           .map(p -> p.getPrice())
				           .toList();
		
		long num = products.stream()
			   	     .filter(p -> p.getPrice() < 30000)
				     .map(Product::getPrice)
				     .count();
		
		System.out.println(prices);
		System.out.println(prices.size());
		System.out.println(num);
		
		
	}

}
