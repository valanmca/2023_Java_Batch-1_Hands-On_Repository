package com.jeban.day3;

import java.util.Stack;
import java.applet.*;

public class Topelementstack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(67);
		stack.push(4);
		System.out.println("Stack:" + stack);

		stack.pop();
		stack.peek();
		System.out.println(stack.peek());

	}

}
