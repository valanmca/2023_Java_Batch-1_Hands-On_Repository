package com.mahesh.ds_day3;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Size {

	public static void main(String[] args) {

		// Question : Find the size of the stack without using stack.

		Stack<Integer> s_ob = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			s_ob.push(sc.nextInt());
		}
		System.out.println("Stack is :" + s_ob);

		int size = 0;

		while (!s_ob.isEmpty()) {
			s_ob.pop();
			size++;
		}

		
		// Another Task
		
		
		/* 
		 * Type 1
		  	while (s_ob.isEmpty() == false) {
			s_ob.pop();
			count++;
			
			Type 2
			while (s_ob.isEmpty() == false) {
			s_ob.pop();
			count++;
		}*/
		System.out.println("Stack size is : " + size);

	}

}
