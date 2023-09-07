package com.jenish.day03;
//Find the second top element of stack.
import java.util.Scanner;
import java.util.Stack;
public class Lab_Sample_Task3 {

	public static void main(String[] args) { 
		
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		
		System.out.println("Stack values:" +stack);
		stack.pop();
		System.out.println(stack.peek());
		sc.close();
	}

}
