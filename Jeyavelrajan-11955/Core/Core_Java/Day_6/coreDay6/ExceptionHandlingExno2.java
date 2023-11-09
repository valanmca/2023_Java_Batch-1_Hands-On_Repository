package com.jeyavel.coreDay6;
//At a time only one exception occurs and at a time only one catch block is executed.
//All catch blocks must be ordered from most specific to most general, 
//i.e. catch for ArithmeticException must come before catch for Exception.
public class ExceptionHandlingExno2 {

	public static void main(String[] args) {
		
		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmethc Exception Occurs");			
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception");
		}
		finally {
			System.out.println("Finally Always runs ");
		}

	}

}
