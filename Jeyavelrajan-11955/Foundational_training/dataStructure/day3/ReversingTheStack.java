

package com.jeyavel.day3;
import java.util.Stack;
import java.util.Scanner;

public class ReversingTheStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stackupdated = new Stack<Integer>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);// initalizing the Scanner
		System.out.println("Enter the Size of the Stack ");

		int length = sc.nextInt();

		//pushing the entered values in the stack
		System.out.println("Enter The Elements of the Stack");
		for (int i = 0; i < length; i++) {
			int temp = sc.nextInt();// size
			stack.push(temp);
		}
		//pop the elements out from the stack and update the pop elements order to the stackupdated 
		System.out.println(stack);
		while(!stack.isEmpty()) {
			stackupdated.push(stack.pop());
			
		}
		System.out.println("Reversed stack"+stackupdated);
		
        
	}
		


		
}
	


	

