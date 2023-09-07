
//Find the size of the stack.[don't use size() method]

package com.shiva.day03;

import java.util.Stack;
import java.util.Scanner;

public class StackExample01 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("To check whether stack is empty : "+stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("\n"+stack);
		
		int count=0;
		while(stack.isEmpty()!=true)//   "while(!stack.isEmpty())"  //counting the size of the stack
		{
			stack.pop();
			count++;
		}
		System.out.println("\nThe size of the stack is :"+count);
	}

}
