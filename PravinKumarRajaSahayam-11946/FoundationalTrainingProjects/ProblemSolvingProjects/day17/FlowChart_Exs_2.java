//Find the Factorial using FlowChart
package com.pravinkumar.day17;
//Algorithms
import java.util.Scanner;

public class FlowChart_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial are : " + fact);
	}

}
