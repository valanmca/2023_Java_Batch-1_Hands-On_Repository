package com.jeyandhan.day08;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int c = 10/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("After Exception");
	}

}
