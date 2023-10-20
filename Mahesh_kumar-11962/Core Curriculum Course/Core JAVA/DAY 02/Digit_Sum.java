package com.mahesh.core_java_day_02;
import java.util.*;

public class Digit_Sum {

	Scanner sc_obj = new Scanner(System.in);
	int value;
	void Count()
	{
		int sum =0;
		System.out.println("Sum of Digits\nEnter a value : ");
		value = sc_obj.nextInt();
		
		for(int i=0;i<=value;i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of "+value+" is :"+sum);
	}
	
	public static void main(String[] args) {
	
		Digit_Sum obj = new Digit_Sum();
		obj.Count();
		

	}

}
