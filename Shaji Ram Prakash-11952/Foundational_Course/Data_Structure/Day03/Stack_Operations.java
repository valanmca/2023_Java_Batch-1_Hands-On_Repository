package com.shaji.Day03;

import java.util.Stack;

public class Stack_Operations {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Size : " + stack.size());//0
		System.out.println("Is Stack is Empty : " + stack.isEmpty());//true
		
		stack.push(-10);// Adding the Elements
		stack.push(20);
		stack.push(30);
		stack.push(-40);
		
		System.out.println("The Elements of Stack are " + stack);//[-10, 20, 30, -40]
		
		stack.pop();//Removing the Elements
		
		System.out.println(stack);//[-10, 20, 30]
		System.out.println(stack.peek());//30
		
		System.out.println("Size : " + stack.size());//3
		System.out.println("Is Stack is Empty : " + stack.isEmpty());//False
	}

}
