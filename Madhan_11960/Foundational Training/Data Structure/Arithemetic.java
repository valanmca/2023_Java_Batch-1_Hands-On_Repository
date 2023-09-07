package com.madhan.day01;
import java.util.Scanner;

public class Arithemetic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number:");
		int a1=sc.nextInt();
		System.out.println("Enter Second number:");
		int a2=sc.nextInt();
		System.out.println("Addition:"+(a1+a2));
//		System.out.println(a1+a2);
		System.out.println("Subtraction:");
		System.out.println(a1-a2);
		System.out.println("Multiplication:");
		System.out.println(a1*a2);
		System.out.println("Division:");
		System.out.println(a1/a2);
	}

}
