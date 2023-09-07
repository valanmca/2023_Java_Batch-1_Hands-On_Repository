package com.dharshu.day3;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer>inputStack=new Stack<Integer>();
		inputStack.push(10);
		inputStack.push(20);
		inputStack.push(30);
		inputStack.push(40);
		inputStack.push(50);
		
		System.out.println("The input stacks are :\n"+inputStack);
	
		
		LinkedList<Integer>sk=new LinkedList<Integer>();
		
		while(!inputStack.isEmpty()) {
			int val=inputStack.pop();
			sk.add(val);
		}
		System.out.println("The input stacks are :\n"+sk);


	}

}
