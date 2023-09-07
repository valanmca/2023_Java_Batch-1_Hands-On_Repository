package com.gayathri.day3;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stackobj = new Stack<Integer>();

		System.out.println("The inital stack size : " + stackobj.size());

		System.out.println("\nIs stack is empty? :" + stackobj.isEmpty());

		// adding new element into stack
		stackobj.push(100);
		stackobj.push(200);
		stackobj.push(300);
		stackobj.push(000);
		stackobj.push(-1);
		stackobj.push(-112);
		stackobj.push(10000);

		System.out.println("\nNow stack size : " + stackobj.size());

		System.out.println("\nIs stack is empty? :" + stackobj.isEmpty());

		System.out.println("\nStack elements : " + stackobj);

		// pop
		stackobj.pop();
		System.out.println("\nAfter pop one element, the stack element is : " + stackobj);

		// peek
		System.out.println("\nPeek one element : " + stackobj.peek());
		
		//stack size
		System.out.println("\nNow stack size : " + stackobj.size());
		
		//add also support because stack work with linked list
		stackobj.add(50);
		System.out.println("\nStack elements : " + stackobj);		
		System.out.println("\nPeek one element : " + stackobj.peek());
		System.out.println("\nRemove one element : " + stackobj.remove(2));
		System.out.println("\nStack elements : " + stackobj);
	}

}
