package com.naveen.day6;

//Keywords - try, catch

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			int b = Integer.parseInt("abc");
			System.out.println("A"); // will not executed because after exception it immediately go for catch block.
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NumberFormatException e) { // ----> Multiple catch block is possible
			System.out.println(e); // ------> It will terminate automatically
		} catch (Exception e) {
			System.out.println(e); // ----->Common Catch Block Exception
		}

		finally {
			System.out.println("Finally");
		}

		System.out.println("After Exception");
	}

}
