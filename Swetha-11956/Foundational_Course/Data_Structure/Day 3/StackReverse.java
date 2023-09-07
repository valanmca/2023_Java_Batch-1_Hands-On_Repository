package com.swetha.day3;
import java.util.Stack;

public class StackReverse {
	public static void main(String[] args) {
		
		//Reversing the stack and storing it in another stack
		Stack<Integer>stack=new Stack<Integer>();
		Stack<Integer>stackrev=new Stack<Integer>();
		
		stack.push(10);	
		stack.push(20);	
		stack.push(30);	
		stack.push(40);	
		
		System.out.println("The original stack is : "+stack);
		
		while(!stack.isEmpty()) {
			int n=stack.pop();
			stackrev.push(n);

}
		System.out.println("The reversed stack is : "+stackrev);
}
}
