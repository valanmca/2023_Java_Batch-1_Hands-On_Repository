//Find the size of stack [Note : do not use size() method]
package com.matthew.day03;
import java.util.Stack;
public class Assignment {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(30);
		stack.add(1);
		stack.add(50);
		stack.add(40);
		stack.add(1);
		stack.add(50);
		stack.add(40);
		int count =0;
		while (!stack.isEmpty()) {
			count+=1;
			stack.pop();
		}
		System.out.println("Size of stack : "+count);
	}

}
