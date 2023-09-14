package com.purushoth.day2;
import java.util.Scanner;
public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int fact=1;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
		     fact=fact*i;
	}
		System.out.println("The factorial of "+num+" is: "+fact);

	}
}
