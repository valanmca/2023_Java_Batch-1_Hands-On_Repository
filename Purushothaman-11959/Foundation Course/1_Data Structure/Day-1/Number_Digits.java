package com.purushoth.day1;
import java.util.Scanner;

public class Number_Digits {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			num/=10;
			count++;
		}
		System.out.println("The count of the number is: "+count);
			}
	}

