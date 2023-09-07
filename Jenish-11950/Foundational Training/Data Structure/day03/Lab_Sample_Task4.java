package com.jenish.day03;
import java.util.Stack;
public class Lab_Sample_Task4 {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2= new Stack<Integer>();
		stack1.push(11);
		stack1.push(12);
		stack1.push(13);
		stack1.push(14);
		stack1.push(15);
		
		System.out.println("Stack values:" +stack1);
		while(!stack1.isEmpty()) {
			int value=stack1.pop();
			stack2.push(value);
		}
		System.out.println("Reverse value of Stack:" +stack2);

		

	}

}
