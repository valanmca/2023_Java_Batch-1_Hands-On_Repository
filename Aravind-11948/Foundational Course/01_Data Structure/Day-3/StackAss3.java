package com.aravind.day3;// find the second top elements of the stack

import java.util.Scanner;
import java.util.Stack;

public class StackAss3 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("stack value = " + stack);
		int val = stack.pop();
		System.out.println("peek value " + stack.peek());
		System.out.println("stack value = " + stack);
		stack.push(val);
		System.out.println(stack);
	}

}
