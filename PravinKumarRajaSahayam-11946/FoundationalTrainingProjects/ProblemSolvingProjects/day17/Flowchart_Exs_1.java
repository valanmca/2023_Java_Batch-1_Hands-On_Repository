//Add two numbers entered by the user
package com.pravinkumar.day17;
//From Algorithms and Flowchart
import java.util.Scanner;
    
public class Flowchart_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Enter the Number1:");
		num1 = sc.nextInt();

		System.out.println("Enter the Number2:");
		num2 = sc.nextInt();

		int sum;
		sum = num1 + num2;
		System.out.println("The Sum of the Numbers is : " + sum);
	}

}
