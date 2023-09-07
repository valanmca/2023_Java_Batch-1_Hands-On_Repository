//Find the second top element of stack
package com.domnic.day3;
import java.util.Scanner;
import java.util.Stack;
public class StackEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(86);
		stack.push(23);
		stack.push(76);
		stack.push(12);
		stack.push(89);
		stack.push(90);

		System.out.println(stack);
		stack.pop();
		System.out.println(stack.peek());
		
         
	}

}
