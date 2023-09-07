package com.mahesh.ds_day3;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Search {

	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			stack.push(sc.nextInt());
		}
		System.out.println("Stack is :" + stack);
		System.out.print("Enter the search element :");
		int search = sc.nextInt();

		boolean flag = false;
		while(!stack.isEmpty())
		{
		if(stack.pop()==search)
		{
			flag=true;
			System.out.print("Element is found");
			break;
		}
		}
		
		if(flag != true)
		{
			System.out.print("Element is not found");
		}
		
		/* Shortcut
		 
		 if(stack.contains(n))
		 {
		 System.out.print("Element is found");
		 }
		 else
		 {
		 System.out.print("Element is not found");
		 }
		 */

	}

}
