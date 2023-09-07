package com.jenish.day03;//Find the Size of Stack [Do not use size()method]

//import java.util.Scanner;
import java.util.Stack;
public class Lab_Sample_Task1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Values Of Stack:" );
		stack.push(11);//Adding the stack elements
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		System.out.println(stack);
		
		int increment=0;
		while(!stack.isEmpty()) {
			stack.pop();
			increment=increment+1;
		}
		System.out.print("Size of Stack:");
		System.out.print(increment+ "\t");
	}

}
