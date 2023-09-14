
//Find the size of the stack .[note : do not use size() method]

package com.jeyavel.day3;

import java.util.Scanner;
import java.util.Stack;

public class SizeofTheStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);// initializing the Scanner
		System.out.println("Enter the Size of the Stack ");

		int length = sc.nextInt();

		System.out.println("Enter The Elements of the Stack");
		for (int i = 0; i < length; i++) {//Append 
			int temp = sc.nextInt();// size

			stack.add(temp);

		}
		System.out.println("The stack values are:" + stack);

		int count = 0;
		while (stack.isEmpty() != true) {
			stack.pop();
			count++;
		}

		System.out.println("the Stack size is " + count);
	}
}
