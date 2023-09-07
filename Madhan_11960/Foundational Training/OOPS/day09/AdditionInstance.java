package com.madhan.day09;
import java.util.Scanner;

public class AdditionInstance {
	
	int a; //default value for int is 0
	
	static int b; //default value works for static variable also.

	public static void main(String[] args) {
		
		
		AdditionInstance obj=new AdditionInstance();
		System.out.println(obj.a+(AdditionInstance.b));
		
		System.out.println("Enter the value:");
		Scanner sc=new Scanner(System.in);
		obj. a=sc.nextInt();
		System.out.println("Addition of a+b:"+(obj.a+(AdditionInstance.b)));

	}

}
