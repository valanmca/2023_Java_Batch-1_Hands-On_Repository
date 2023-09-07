package com.jenish.day01;
import java.util.Scanner;

public class Calculator_Ex {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 2 values:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		System.out.println("Add 2 values:"+(a+b));
		System.out.println("Subtract 2 values:"+(a-b));
		System.out.println("Mulitply 2 values:"+(a*b));
		System.out.println("Divide 2 values:"+(a/b));
		
		obj.close();
	}

}
