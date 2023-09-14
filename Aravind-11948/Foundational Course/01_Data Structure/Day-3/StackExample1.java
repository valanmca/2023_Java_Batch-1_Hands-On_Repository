package com.aravind.day3;

import java.util.Stack;
import java.util.Scanner;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println("Is stack empty: " + stack.isEmpty());
		System.out.println("size: " + stack.size());

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of stack=");
		int size = sc.nextInt();
		System.out.println("enter the value of stack =");
		for (int i = 0; i < size; i++) {
			int values = sc.nextInt();
			stack.push(values);
		}

		/*
		 * stack.push(10);// insertion stack.push(20); stack.push(30);
		 */

		System.out.println("stack contain =" + stack);// display the stack

		int val = stack.pop();// delection
		System.out.println("Popped element : " + val);
		System.out.println("stack contain =" + stack);

		int peek = stack.peek();
		System.out.println("peek element in the stack: " + peek);// display the top element without removing

		System.out.println("stack contain =" + stack);

		System.out.println("Is stack empty: " + stack.isEmpty());
		System.out.println("size: " + stack.size());

	}

}
