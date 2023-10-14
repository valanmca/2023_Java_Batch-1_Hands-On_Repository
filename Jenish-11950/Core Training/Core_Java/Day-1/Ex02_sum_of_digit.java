package com.jenish.day1;
import java.util.Scanner;
public class Ex02_sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number :");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		
		 int digit,sum=0;
		 while(n>0) {
		 digit = n % 10;
		 sum = sum + digit;
		 n= n / 10;
		
		 }
		 System.out.println("The Sum of digits :"+sum);

	}

}
