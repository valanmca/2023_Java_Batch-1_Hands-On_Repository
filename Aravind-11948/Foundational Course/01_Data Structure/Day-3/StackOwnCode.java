package com.aravind.day3;

import java.util.Scanner;
import java.util.Stack;

public class StackOwnCode {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);
		/*stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);*/
		System.out.println("enter the size of stack=");
		int size = sc.nextInt();
		System.out.println("enter the value of stack =");
		for (int i = 0; i < size; i++) {
			int values = sc.nextInt();
			stack.push(values);
		}
		
		System.out.println("stack value = "+stack);
		
		
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int temp=0;
		int count =0;
		while(!stack.isEmpty())
		{
			temp=0;
			int val=stack.pop();
			if(n==val)
			{
				temp=1;
				count++;
				//break;
			}
			else
			{
				temp=0;
			
			}
		}
			
		
		if(temp==1)
			{
				System.out.println("yes : "+count);
			}
			else
			{
				System.out.println("no");
			}
		
	}

}
