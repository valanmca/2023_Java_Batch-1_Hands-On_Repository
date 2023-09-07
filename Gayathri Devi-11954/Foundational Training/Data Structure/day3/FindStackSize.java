package com.gayathri.day3;

import java.util.Stack;

public class FindStackSize {
	// find stack size without size() method

	public static void main(String[] args) {
		Stack<Integer> stackobj = new Stack<Integer>();

		stackobj.push(100);
		stackobj.push(200);
		stackobj.push(300);
		stackobj.push(400);
		stackobj.push(500);
		stackobj.push(600);
		stackobj.push(700);

		int size = 0;
		System.out.println("\nThe stack elements ....." + stackobj);

		while (!stackobj.isEmpty()) {
			stackobj.pop();
			size++;
		}
		System.out.println("\nThe size of the stack : " + size);
	}
}
