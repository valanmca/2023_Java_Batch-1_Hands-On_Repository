package com.madhan.day03;
import java.util.Stack;

public class StackAssignment3 {

	public static void main(String[] args) {
	 Stack<Integer> stack=new Stack<Integer>();
	 stack.push(100);
	 stack.push(500);
	 stack.push(30);
	 stack.push(90);
	 stack.push(700);
	 System.out.println(stack);
	 System.out.println(stack.pop());
	 System.out.println("The second top element is :" +stack.peek());
	}

}
