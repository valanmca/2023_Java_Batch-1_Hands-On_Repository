package com.matthew.day03;
import java.util.Stack;
public class stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Size: "+stack.size());
		System.out.println("IsEmpty : "+stack.isEmpty());
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("After adding Elements in the Stack : ");
		System.out.println("Elements in Stack : "+stack);
		System.out.println("After using pop :");
		stack.pop();
		System.out.println(stack);
		System.out.println("After using peek()");
		stack.peek();
		System.out.println(stack);
		System.out.println("Size of stack : "+stack.size());
		System.out.println("Checking if the atack is empty or not : "+stack.isEmpty());
	}

}
