package com.purushoth.day3;

import java.util.Stack;
import java.util.Scanner;

public class StackSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int num = sc.nextInt();
		System.out.println("The elements are: ");
		for (int i = 0; i < num; i++) {
			stack.push(sc.nextInt());
		}
		System.out.println("The stack is: " + stack);
		System.out.println("The element to search: ");
		int search = sc.nextInt();
		int count = 0;
		/*
		 * if(stack.contain(n))
		 *  System.out.println("yes"); 
		 * else
		 *  System.out.println("no");
		 */
		while (!stack.isEmpty()) {
			int a = stack.pop();
			if (a == search) {
				System.out.println("The element we searched is " + a + " and found.");
				count++;
			}

		}
		if (count == 0) {
			System.out.println("The element is not found.");
		}

	}

}//Search
