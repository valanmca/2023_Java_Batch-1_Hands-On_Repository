//Searching the given element from the stack [Note : Use push(),isEmpty() & pop()]
//we can use stsck.contain to check if the element is present in the  stack.
package com.matthew.day03;
import java.util.Stack;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		System.out.println("Enter the number to check in the stack : ");
		int num = sc.nextInt();
		boolean isPresent =false;
		while(!stack.isEmpty()) {
			if (num==stack.pop()) {
				System.out.println("The number "+num+" is present in the Stack");
				isPresent = true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println("The number "+num+" is not present in the Stack");
		}
	}

}
