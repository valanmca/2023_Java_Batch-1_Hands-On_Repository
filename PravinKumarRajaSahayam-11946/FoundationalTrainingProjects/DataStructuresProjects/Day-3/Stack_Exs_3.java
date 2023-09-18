//Searching the given Element from the Stack. (Note:- Use push(),isEmpty(),&, pop())
package com.pravinkumar.day3;

import java.util.Stack;
import java.util.Scanner;

public class Stack_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("The given numbers are:" + stack);

		System.out.println("Enter the Number for Find:");
		int check = sc.nextInt();

		int temp = 0;
		while (!stack.isEmpty()) {
			temp = stack.pop();
			{
				if (temp == check) {
					System.out.println("The given number" + " " + check + " " + "is a true");
					temp++;
				}
			}
		}
		if (temp == 0) {
			System.out.println("The given number" + " " + check + " " + "is a false");
		}
	}

}

/*
 * if(stack.contains(n)) System.out.println("Yes"); else
 * System.out.println("No");
 */

/*
 * int n = sc.nextInt(); boolean isPresent = false; while(! stack.isEmpty()) {
 * if(n == stack.pop()) { System.out.println("Yes it is Present"); isPresent =
 * true; break; } }
 * 
 * if(!isPresent) System.out.println("It is not a Present");
 */