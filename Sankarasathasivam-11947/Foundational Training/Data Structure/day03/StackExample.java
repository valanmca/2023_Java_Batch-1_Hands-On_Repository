package com.shiva.day03;
//Adding,deleting and removing in Stack
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stack=new Stack<Integer>();
		
		System.out.println("size : "+stack.size());
		System.out.println("The stack is empty : "+stack.isEmpty());
		System.out.println(" ");
		
		stack.push(10); // Inserting the value
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("The values in the Stack : "+stack); //[10,20,30,40]
		System.out.println(" ");
		
		stack.pop(); // Removing the top value
		
		System.out.println("The Removed element in the Stack : "+stack.pop());
		System.out.println(" ");
		
		System.out.println("After removal of top element : "+stack);//[10,20,30]
		System.out.println(" ");
		
		stack.peek();//Displaying the top element
		System.out.println("\nThe top value : "+stack.peek());//20
		
		System.out.println("size : "+stack.size());//2
		System.out.println(stack.isEmpty());//false
	
	
	}

}
