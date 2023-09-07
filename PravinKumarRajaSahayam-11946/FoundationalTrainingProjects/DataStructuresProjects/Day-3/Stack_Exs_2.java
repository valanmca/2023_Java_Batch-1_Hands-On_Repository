//Find the size of the stack.(Note:- do not use size() Method)
package com.pravinkumar.day3;

import java.util.Stack;
import java.util.Scanner;

public class Stack_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println("The given Numbers are: " + stack);
		int count = 0;
		boolean work = true;
		while (work) {
			if (stack.isEmpty()) {
				work = false;
			} else {
				count++;
				stack.pop();
			}
		}
		System.out.println("The Count of the given number is: " + count);
	}
}
/*
 * int size=0; while(! stack.isEmpty()) { stack.pop(); size++; }
 * System.out.println(size);
 */