package com.shiva.day01;
import java.util.Scanner;
public class CountNumber {

	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the digits ");
		int digit=sc.nextInt();
		
		while(digit!=0)
		{
			digit=digit/10;
			count++;
		}
		System.out.println("the total number of digit is : "+count);
	}

}
