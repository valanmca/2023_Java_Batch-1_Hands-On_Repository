package com.matthew.day15;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum;
		System.out.println("Enter two numbers num1,num2 :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sum = num1+num2;
		System.out.println("Sum : "+sum);
	}

}
