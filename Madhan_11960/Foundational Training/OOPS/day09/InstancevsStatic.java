package com.madhan.day09;
import java.util.Scanner;

public class InstancevsStatic {
	
	int a=10;

	
	
	public static void main(String[] args) {
		
		InstancevsStatic obj1=new InstancevsStatic();
		InstancevsStatic obj2=new InstancevsStatic();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
          
		System.out.println("Enter the new value:");
		Scanner sc=new Scanner(System.in);
		obj1.a=sc.nextInt();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
	}

}
