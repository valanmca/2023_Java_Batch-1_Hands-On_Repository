package com.purushoth.day_06;

import java.util.Scanner;
public class MultipleHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value: ");
		int b=sc.nextInt();
		int c=0;
		int arr[]= null;
		try {
			c=a/b;
			System.out.println(arr.length);
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		finally {
			System.out.println(c);
        	System.out.println("Code ended");
        }
        
	}


}
