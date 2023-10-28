package com.dharshu.day7;

public class Ex_2_Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Exception");
		try {
			int a = 10 / 0;				//ArithmeticException: / by zero
			int b = Integer.parseInt("abc");// In Line 9 there is ArithmeticException so it will come out of try block
			System.out.println("A");	//It will come out of the try block to catch block.
		} catch(NumberFormatException e) { // It will throw Catch to arithmetic exception
			System.out.println(e);
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) { 			
			System.out.println(e);
		} finally {
			System.out.println("Finally "); //before terminating our program ensure that program terminating safely.
		}
		System.out.println("After Exception");

	}

}
