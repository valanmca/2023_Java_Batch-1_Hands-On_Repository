package com.gayathri.day3;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {

		Stack <Integer> originalStack = new Stack <Integer> ();
		originalStack.push(1000);
		originalStack.push(2000);
		originalStack.push(3000);
		originalStack.push(4000);
		originalStack.push(5000);
		System.out.println("\nThe original stack elements are....."+originalStack);
		
		Stack <Integer> reverseStack = new Stack <Integer> ();
		while(!originalStack.isEmpty())
		{
			int num = originalStack.pop();
			reverseStack.push(num);
		}
		System.out.println("\nThe reverse stack elements are....."+reverseStack);
			}

}

