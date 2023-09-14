package com.dharshu.day3;

import java.util.Stack;

public class SecondTop {

	public static void main(String[] args) {
		Stack<Integer>sk=new Stack<Integer>();
		
		//inserting the element in stack
				sk.push(10);
				sk.push(20);
				sk.push(30);
				sk.push(40);
				sk.push(50);
				
				System.out.println("The element in an stacks are :\n"+sk);
				
				sk.pop();
				
				System.out.println("The top element in an stack is :\n"+sk.peek());
	}

}
