package com.muthu.day2;



import java.util.Stack;

public class assignmentstack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int count = 0;
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		int size = 0;
		while (!stack.isEmpty()) {
			stack.pop();
			count++;
		}
		System.out.println("stack:" + count);
	}

}
