package com.madhan.day09;
import java.util.Scanner;

public class Assignclassobject {
	
	void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	static void digitcount(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial value:");
		int fact=sc.nextInt();
		
		Assignclassobject  obj=new Assignclassobject ();
		
		obj.factorial(fact);
		
		System.out.println("Enter the digitcount value:");
		int digit=sc.nextInt();
		
		Assignclassobject.digitcount(digit);
	}

}
