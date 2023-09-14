//Find the size of the stack [Do not use size()method]
package com.domnic.day3;

import java.util.Stack;
import java.util.Scanner;

public class StackEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		stack.push(10);
		stack.push(20);
		stack.push(44);
		stack.push(33);
		stack.push(41);

		while (!stack.isEmpty()) {
			stack.pop();
			count++;
		}
		System.out.println("The Size of the stack :" + count);

	}
}
