package com.naveen.day1;

/*Sum of digits*/
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
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
