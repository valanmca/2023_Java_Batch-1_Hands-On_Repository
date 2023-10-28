package com.dharshu.day7;

public class Ex_3_NestedCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;
			try {
				int b = Integer.parseInt("abc");
			} catch (ArithmeticException e) {
				System.out.println("A");
			}
		} catch (NumberFormatException e) {
			System.out.println("B");
		} catch (ArithmeticException e) {
			System.out.println("C");
		} catch (Exception e) {
			System.out.println("D");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("After Exception");

	}

}
