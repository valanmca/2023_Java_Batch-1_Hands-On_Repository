package com.purushoth.day_01;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number: ");
     int num=sc.nextInt();
     int fact=1;
     for (int i=1;i<=num;i++) {
    	 fact=fact*i;
     }
     System.out.println("Factorial of "+num+" is "+fact);
	}

}//5. Write a Java program to find the factorial of the given number.
