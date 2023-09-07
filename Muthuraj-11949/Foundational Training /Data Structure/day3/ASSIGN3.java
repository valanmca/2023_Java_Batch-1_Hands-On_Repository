package com.muthu.day3;
import java.util.Stack;

public class ASSIGN3 {

	public static void main(String[] args) {
		Stack<Integer>   stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);	
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println("the second element:" +stack.peek());//second element 
			
		

	}

}
