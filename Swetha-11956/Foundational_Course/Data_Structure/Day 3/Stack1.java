package com.swetha.day3;
import java.util.Stack;
public class Stack1 {

	public static void main(String[] args) {
		
		//Creating a Stack
		Stack<Integer> stack=new Stack<Integer>();
		
		//Initially printing the size of stack
		System.out.println("size of Stack : "+ stack.size());
		
		//Adding elements to the stack
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("After Inserting elements in the stack : "+stack);
		
		//Removing elements from the top of the stack using pop()
		stack.pop();
		System.out.println("After removing an element from the top : "+stack);
		
		//Print the top element using peek()
		System.out.println("The top element of stack is : "+stack.peek());
		
		//Printing the stack elements
		System.out.println("The stack elements are : "+stack);
		
		//size of stack
		System.out.println("The size of stack : "+stack.size());
		
		//Check stack is empty....true-empty......false-not empty
		System.out.println("The stack is empty : "+stack.isEmpty());
		
		
		
			}

}
