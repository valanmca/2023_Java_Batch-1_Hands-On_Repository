//Reversing the Stack.
package com.pravinkumar.day3;

import java.util.Stack;
import java.util.Scanner;

public class Stack_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> result = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Before Reverse is: " + stack);
		while (!stack.isEmpty()) {
			result.push(stack.pop());
		}
		System.out.println("After Reverse is: " + result);
	}

}
