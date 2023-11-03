package com.naveen.day6;

// Nested try catch
/*If Exception occurs in the outer try it search for outer catch block.
 * If Exception occurs in the inner try block it search for inner catch block.
 * If inner matching catch block not found means it will go for outer catch block */
public class Ex03 {

	public static void main(String[] args) {

		System.out.println("Before Exception");
		try {
			int a = 10 / 2;
			try {
				int b = Integer.parseInt("abc");
			} catch (NumberFormatException e) {
				System.out.println("A");
			}
		} catch (ArithmeticException e) {
			System.out.println("B");
		} catch (NumberFormatException e) {
			System.out.println("C");
		} catch (Exception e) {
			System.out.println("D");
		}

		finally {
			System.out.println("Finally");
		}
		System.out.println("After Exception");
	}

}
