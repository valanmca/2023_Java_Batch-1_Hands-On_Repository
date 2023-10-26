package com.jeban.Exception;

////****Keywords-try,catch*****////

public class Exception2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			throw new Error();
//			int a = 10 / 0;// it's only Execute
//			int b = Integer.parseInt("abc");// It's not Execute
//			System.out.println("A");
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally");
		}

		System.out.println("After Exception");

	}

}
