package com.swetha.day1;
import java.util.Scanner;
public class DigitCount {
     
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to count : ");
		int num=sc.nextInt();
		int count=0; 
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("The count of the given number is : "+count);
	}
}
