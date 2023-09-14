package com.gayathri.day3;

import java.util.Stack;

public class SecondTop {

	public static void main(String[] args) {

		Stack<Integer> stackobj = new Stack<Integer>();

		// insert
		stackobj.push(100);
		stackobj.push(200);
		stackobj.push(300);
		stackobj.push(400);
		stackobj.push(500);
		stackobj.push(600);
		
		System.out.println("\nThe stack elements are....." + stackobj);
		
		stackobj.pop();
		
		System.out.println("\nThe 2nd top elements is....." + stackobj.peek());

	}

}
