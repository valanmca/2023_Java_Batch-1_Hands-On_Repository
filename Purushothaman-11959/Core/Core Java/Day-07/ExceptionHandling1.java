package com.purushoth.day_07;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a =10/0;
		}catch(ArithmeticException e) {
			System.out.println("Can't able to divide by Zero");
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}finally {
			System.out.println("Finally");
		}
        System.out.println("After Exception");
	}

}
