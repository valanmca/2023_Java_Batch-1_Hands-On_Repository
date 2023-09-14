package com.swetha.day3;
import java.util.Stack;
import java.util.Scanner;
public class StackSize {

	public static void main(String[] args) {
		
		//Find the size of the stack without using size() method
		Stack<Integer> stack=new Stack<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		
		//Removing the element from stack until satck becomes empty
		int count=0;
		while(!(stack.isEmpty())) {
			stack.pop();
			count++;
		}
		
		System.out.println("The size of Stack is : "+count);
		

	}

}
