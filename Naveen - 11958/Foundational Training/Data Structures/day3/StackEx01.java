package com.naveen.day3;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Size :"+stack.size()); //Return the Size of the Stack.
		System.out.println("Is the Stack is Empty :"+stack.isEmpty()); //Return True or False, based on the size of the stack.
		
		stack.push(10); //Inserting the Element
		stack.push(20);
		stack.push(30);
		
		
		System.out.println(stack); //[10,20,30]
		
		stack.pop(); //Remove the Top Element. i.e, 30
		
		System.out.println(stack); //[10,20]
		
		System.out.println(stack.peek()); //Print the Top Element i.e, 20
		
		System.out.println(stack); //[10,20]
		
		System.out.println("Size :"+ stack.size()); //2
		System.out.println(stack.isEmpty()); //False
		
			
	}

}
