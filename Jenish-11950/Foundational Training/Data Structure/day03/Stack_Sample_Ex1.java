package com.jenish.day03;
import java.util.Stack;
public class Stack_Sample_Ex1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Values Of Stack:" +stack.size()+"\n");
		System.out.println("Is Stack is Empty:" +stack.isEmpty()+"\n");
		
		stack.push(11);//Adding the stack elements
		stack.push(12);
		stack.push(13);
		System.out.println(stack+"\n");//[11,12,13]
		
		stack.pop();//Removing the Top Elements i.e, 13
		System.out.println(stack +"\n");
		
		stack.peek();//print the top elements i.e, 12
		System.out.println(stack.peek() +"\n");
		
		System.out.println(stack+"\n");//[11,12]
		
		stack.size();
		System.out.println("Size:" +stack.size()+"\n");//print the size of stack i.e, 2
		
		System.out.println("Is Stack is Empty:" +stack.isEmpty()+"\n");
		

	}

}
