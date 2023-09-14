package com.jeban.day3;//Find the size of the stack

import java.util.*;
import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(19);
		stack.push(29);
		stack.push(30);
		stack.push(67);
		System.out.println(stack);
		int count = 0;
		while (!stack.isEmpty()) {
			stack.pop();
			count++;
		}

		System.out.println(count);

	}

}
