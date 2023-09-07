package com.muthu.day1;
import java.util.*;
public class MyClass
{

	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the No:");
		int no=a.nextInt();
		System.out.println("Number: "+no);
		System.out.println("Enter Id:");
		char id=a.next().charAt(0);
		System.out.println("Id: "+id);
		System.out.println("Enter NAME");
		String muthuraj=a.next();
		System.out.println("NAME: "+muthuraj);		
	}
}
