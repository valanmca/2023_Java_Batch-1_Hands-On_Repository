package com.purushoth.day3;
import java.util.Stack;

public class StackPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack =new Stack<Integer>();
		
		System.out.println("Size of the stack: "+stack.size());
		System.out.println("Is the stack is empty: "+stack.isEmpty());//To check the stack is empty
		
		stack.push(15);//To add on top
		stack.push(25);
		stack.push(35);
		stack.push(45);
		
		System.out.println(stack);
		
		stack.pop();//To delete top element
		
		System.out.println(stack);
		
		System.out.println(stack.peek());//To show top element
		
		System.out.println(stack);
		
		System.out.println("The size of the stack is: "+stack.size());
		System.out.println("Is the stack is empty: "+stack.isEmpty());
		
		

	}

}//Add and delete in Stack
