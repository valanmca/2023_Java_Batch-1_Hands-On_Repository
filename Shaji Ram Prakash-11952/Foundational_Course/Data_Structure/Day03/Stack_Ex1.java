package com.shaji.Day03;

import java.util.Stack;
//Find the Size of the Stack.[Note : Don't use size() Method].
public class Stack_Ex1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int size=0;
		
		stack.push(10);
		stack.push(-20);
		stack.push(-30);
		stack.push(40);
		
		System.out.println("The Elements are " + stack);

		while(!stack.isEmpty()) {
			stack.pop();
			size++;
		}
				
		/*boolean work = true;
		System.out.println("The Elements are " + stack);
		while(work) {
			if(stack.isEmpty()) {
				work=false;
			}
			else {
				count=count + 1;
				stack.pop();
			
			}// method to know
		}
		*/
		System.out.println("The Size of the Elements : " + size);
		 
		
	}

}
