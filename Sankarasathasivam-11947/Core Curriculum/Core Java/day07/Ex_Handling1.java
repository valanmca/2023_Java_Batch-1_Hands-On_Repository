package com.shiva.core.day07;

public class Ex_Handling1 {

	public static void main(String[] args) {
		int a=10,b=0;
		int c=0;
		int arr[]=null;
		
		try {
			
			System.out.println(arr.length);
			c=a/b;
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(c);
		System.out.println("The End");
	}

}
