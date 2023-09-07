
//Reversing the Stack

package com.shiva.day03;

import java.util.Stack;
import java.util.Scanner;

public class StackExample04 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int value=sc.nextInt();
			stack.push(value);
		}
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
		System.out.println(stack);
		
		Stack<Integer> stack1=new Stack<Integer>();
	
		while(!stack.isEmpty())
		{
			int v=stack.pop();
			stack1.push(v);
		}
		System.out.println("The Reversing the elements : "+stack1);
	}
}
