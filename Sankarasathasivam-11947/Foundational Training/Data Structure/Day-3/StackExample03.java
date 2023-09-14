
//Find the Second top element of the stack

package com.shiva.day03;
import java.util.Stack;
public class StackExample03 {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		
		//stack.pop();
		System.out.println(stack.pop());
		
		System.out.println("The element is "+stack.peek());
		//stack.peek();

	}

}
