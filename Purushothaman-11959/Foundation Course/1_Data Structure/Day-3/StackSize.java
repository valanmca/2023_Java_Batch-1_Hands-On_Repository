package com.purushoth.day3;

import java.util.Stack;
import java.util.Scanner;

public class StackSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements to add: ");
		int temp = sc.nextInt();
		System.out.println("The elements are: ");
		for (int i = 0; i < temp; i++) {
			stack.push(sc.nextInt());
		}
		int size = 0;
		System.out.println("The stack is: " + stack);
		while (!stack.isEmpty()) {
			stack.pop();
			size++;
		}
		System.out.println("The size is: " + size);
	}
}//To check size of stack.
