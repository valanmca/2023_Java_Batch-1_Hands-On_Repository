package com.mahesh.ds_day2;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
	int fact =1;
	int number;
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter your Factorial value : ");
	number= sc.nextInt();
	
	for(int i=1;i<=number;i++)
	{
		fact = fact*i;
		
	}
	System.out.print("Factorial value is :"+fact);
	
}
}
