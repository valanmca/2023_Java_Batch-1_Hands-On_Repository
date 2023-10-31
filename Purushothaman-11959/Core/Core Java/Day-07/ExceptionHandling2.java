package com.purushoth.day_07;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a=10/0;
			try {
				int b=Integer.parseInt("abc");
			} catch(NumberFormatException e) {
				System.out.println("A");
			}
		} catch(NumberFormatException e) {
			System.out.println("B");
		} catch(ArithmeticException e) {
			System.out.println("C");
		} catch(Exception e) {
			System.out.println("D");
		} catch(Throwable e) {
			System.out.println("S");//Throwable also allowing
		}
		finally {
			System.out.println("Finally");
		}
        System.out.println("After Exception");	
        }

}
