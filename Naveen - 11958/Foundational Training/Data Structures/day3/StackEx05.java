//Reversing the Stack

package com.naveen.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackEx05 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range :");
		int range = sc.nextInt();

		System.out.println("Enter The List Values :");
		for (int i = 0; i < range; i++) {
			int num = sc.nextInt();
			stack.push(num);
		}
		System.out.println("The Stack are :" +stack);
		
		Stack<Integer> stack01 = new Stack<Integer>();
		for(int i=0; i<range; i++) {
			stack01.push(stack.pop());
		}
		System.out.println("The Stack01 are :" +stack01);
		
		sc.close();

	}

}
