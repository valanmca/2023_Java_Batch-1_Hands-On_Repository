package com.jeyandhan.day07;

public class ExpHandle {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 0;
//		int c = 0;
		int age = 17;
//		try {
//			c = a/b;
//			int d[] = null;
//			System.out.println(d.length);
//			System.out.println("Try Runs");
//		}
//		
//		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
//			System.out.println(e);
//		}
//		
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		
//		
//		finally {
//			System.out.println("Program ends");
//		}
//		
////		System.out.println(c);
		
		if(age < 18) {
			throw new ArrayIndexOutOfBoundsException("Not eligible");
		}
		
		else if (age > 18) {
			System.out.println("eligible");
		}
		
		
	}

}
