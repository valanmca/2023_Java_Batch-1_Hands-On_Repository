package com.jeban.day3;

import java.util.*;

public class Reversingstack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Stack:" + stack);

		Stack<Integer> stack1 = new Stack<Integer>();
		while (!stack.isEmpty()) {
			stack1.push(stack.pop());

		}

		System.out.println(stack1);

	}

}
