package com.jeban.day3;

import java.util.Stack;
import java.util.*;

public class Stackpractice1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Stack:" + stack);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int jeb = 0;
		while (!stack.isEmpty()) {
			if (stack.pop() == n) {
				System.out.println("yes");
				jeb++;
			}

		}
		if (jeb == 0) {
			System.out.println("no");
		}
		if (stack.contains(n))
			System.out.println("yes");
		else
			System.out.println("No");

	}

}
