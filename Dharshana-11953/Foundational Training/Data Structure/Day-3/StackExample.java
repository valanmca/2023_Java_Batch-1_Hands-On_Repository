package com.dharshu.day3;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer>stack=new Stack<Integer>();
		
		System.out.println("Size:"+stack.size());//0 because there is no element in stack
		System.out.println("The Stack is empty:"+stack.isEmpty());//true because the stack contains no element
		
		//inserting the element in the stack
		stack.push(10);
		stack.push(20);
		stack.push(-30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);//display the element in stack
		
		//remove the top element in stack(50)
		stack.pop();//delete the element (50)
		System.out.println(stack);//display the element in stack
		
		System.out.println(stack.peek());//print the top element i.e,40
		System.out.println(stack);//display the element in stack
		
		System.out.println("Size:"+stack.size());//display the size of the stack i.e,4
		System.out.println("The Stack is empty:"+stack.isEmpty());//false because the stack contains  element
		
		stack.set(0,20);
		System.out.println(stack);
		
		//stack.get(0);
		System.out.println(stack.get(0));
		
		System.out.println(stack.peek());//print the top element i.e,40
		//System.out.println(stack);//display the element in stack

		
	}

}
