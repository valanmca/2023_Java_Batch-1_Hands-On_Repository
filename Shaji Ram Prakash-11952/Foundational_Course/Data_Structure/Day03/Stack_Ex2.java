package com.shaji.Day03;

import java.util.Stack;
import java.util.Scanner;

public class Stack_Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(-10);// Adding the Elements
		stack.push(20);
		stack.push(30);
		stack.push(-40);
		
		System.out.println("The Elements are " + stack);
		
		System.out.println("Enter the Element to search : ");
		int value = sc.nextInt();
		int sum =0;
		
		while(!stack.isEmpty()) {
		int val = stack.pop();
		
		if(val==value) {
			System.out.println("The Value is Present...");
			sum++;
			break;
		}
		
	}
		if(sum==0) {
			System.out.println("The Value is Absent...");
		}

}
}
