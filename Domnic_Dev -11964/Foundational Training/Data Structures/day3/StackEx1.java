package com.domnic.day3;
import java.util.Stack;
import java.util.Scanner;
public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> userStack=new Stack<Integer>();
		System.out.println("Size of stack is :"+stack.size());
		System.out.println("Stack is empty :"+stack.isEmpty());
		System.out.println();
		stack.push(123);
		stack.push(98);                   //inserting(push)
		stack.push(35);
		stack.push(51);
		stack.push(70);
		
		System.out.println("Size of stack is :"+stack.size()); //Displaying size
		System.out.println(stack);
		
		stack.pop();                    //deleting(pop)
		stack.pop();
		System.out.println();
		
		System.out.println("Size of stack is :"+stack.size()); 
		System.out.println(stack);
		
		System.out.println(stack.peek());     //Displaying the top element
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Stack");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" Elements");
		for(int i=0;i<size;i++) {
			userStack.push(sc.nextInt());
		}
		System.out.println("User Entered Stack :"+userStack);
		
		
		
		
		
	}

}
