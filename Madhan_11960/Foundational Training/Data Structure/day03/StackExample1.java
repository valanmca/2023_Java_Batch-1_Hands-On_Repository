package com.madhan.day03;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		
		System.out.println("Check Stack is Empty :" +stack.isEmpty());
//		stack.push(10);
//		stack.push(20);
//		stack.push(100);
//		stack.push(30);
//		stack.push(50);
//		stack.push(20);
//		stack.push(null);
//		System.out.println("The elements in the stack are:"+ stack);
//		
//		System.out.println("The Size of the elements:"+stack.size());
//	
		System.out.println("The popped element is:"+stack.pop());
		
		System.out.println("The peek element is :" +stack.peek());
		
		System.out.println("Check Stack is Empty :" +stack.isEmpty());
		
		
		
		
	}

}
