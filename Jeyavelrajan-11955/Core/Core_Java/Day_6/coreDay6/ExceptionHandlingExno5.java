package com.jeyavel.coreDay6;

public class ExceptionHandlingExno5 {
	
	static void exc()throws ArithmeticException{
		System.out.println("inside the method()");
		throw new ArithmeticException("throwing ArithmeticException");
	}

	public static void main(String[] args) {
	   	try {
	   		exc();
	   	}
	   	catch(ArithmeticException e) {
	   		System.out.println("catch in exc() method using Arithmetic exception ");
	   		
	   	}

	}

}
