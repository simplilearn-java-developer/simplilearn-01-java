package com.simplilearn.fsd._14_exceptions;

public class HelloException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	HelloException() {
		super();
	}

	HelloException(String message) {
		super(message);
	}	
}
