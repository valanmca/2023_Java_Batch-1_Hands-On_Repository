package com.mahesh.ds_day3;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Peek {

	public static void main(String[] args) {
		//Question to find the second top element
		
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			stack.push(sc.nextInt());
			
		}
		System.out.println("Stack is :" + stack);
		
		//System.out.print(stack.peek());
		stack.pop();
		System.out.print("Second Peek/Top element is : "+stack.peek());

	}

}
