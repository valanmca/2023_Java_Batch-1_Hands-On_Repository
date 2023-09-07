//find the size of stack without using size()method 
package com.aravind.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackAss1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack.pop());

		System.out.println("enter the size of stack=");

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println(stack);
		System.out.println(stack.peek());
		int count = 0;
		while (stack.isEmpty() != true) {// while (!stack.isEmpty())
			stack.pop();
			count = count + 1;
		}
		System.out.println("size of stack : " + count);

	}

}
