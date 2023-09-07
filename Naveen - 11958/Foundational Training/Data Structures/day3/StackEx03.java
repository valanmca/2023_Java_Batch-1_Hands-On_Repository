//Searching the given element from the stack. [Note: Use push(),  isEmpty() & pop() ].

package com.naveen.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackEx03 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		Scanner sc = new Scanner(System.in);
		System.out.println("The Element to be Searched :");
		int n = sc.nextInt();
		
		/*if(stack.contains(n))
		 	System.out.println("Yes");
		 else
		 	System.out.println("No");
		 	*/

		int count = 0;
		while (!stack.isEmpty()) {
			if (stack.pop() == n) {
				count = 1;
			}
		}

		if (count == 1) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
		sc.close();

	}

}

/*
 * boolean isPresent = false; 
 * while(! stack.isEmpty()){ 
 * if(n == stack.pop()){
 * System.out.println("Yes"); 
 * isPresent=true; 
 * break; 
 * } } 
 * if(!isPresent)
 * System.out.println("No");
 */