package com.dharshu.day3;

import java.util.Stack;

public class StackSize {

	public static void main(String[] args) {
		Stack<Integer> sk = new Stack<Integer>();

		// inserting the element in the stack
		sk.push(10);
		sk.push(20);
		sk.push(30);
		sk.push(40);
		sk.push(50);

		System.out.println("The elements in an stack:" + sk);
        //find the size of the stack without using the size() method.
		int count = 0;
		while(!sk.isEmpty()) {
			sk.pop();
			count++;
		}
		
			System.out.println("The  size of the stack :" +count);
		}

	}


