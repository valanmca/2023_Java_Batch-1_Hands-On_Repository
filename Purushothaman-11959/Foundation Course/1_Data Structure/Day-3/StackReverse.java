package com.purushoth.day3;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int num = sc.nextInt();
		System.out.println("The elements are: ");
		for (int i = 0; i < num; i++) {
			stack1.push(sc.nextInt());
		}
		System.out.println("The Stack1 is: " + stack1);
		
		for (int i=0;i<num;i++) {
			stack2.push(stack1.pop());
		}
        System.out.println("The Stack2 is: "+stack2);
		
		/*Day 3 assignments:
		 * 1.Find the size of the stack.(do not use size());
		 *2.Searching the given element from the stack.
		 *3.Find the second top element of stack.
		 *4.Reversing the stack.
		 *5.H/W: Pattern [only one loop];
		 */

	}

}// Reverse the stack and store
