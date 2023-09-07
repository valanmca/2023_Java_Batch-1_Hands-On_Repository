package com.mahesh.ds_day1;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter First values :");
		int a = ob.nextInt();
		System.out.print("Enter Second values :");
		int b =ob.nextInt();
		

		System.out.print("\nAdd 2 values :"+(a+b));
		System.out.print("\nSubract 2 values :"+(a-b));
		System.out.print("\nMultiply 2 values :"+(a*b));
		System.out.print("\nDevide 2 values :"+(a/b));
		System.out.print("\nModulo 2 values :"+(a%b));
		
		


	}

}
