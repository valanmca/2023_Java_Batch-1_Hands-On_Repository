//searching the given element from the stack without using index value.

package com.madhan.day03;
import java.util.Scanner;
import java.util.Stack;

public class StackAssignment2 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Check whether stack is empty:"+stack.isEmpty());
		System.out.println("Enter the elements:");
		Scanner size=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int n=size.nextInt();
			stack.push(n);
		}
//		stack.push(20);
//		stack.push(10);
//		stack.push(80);
//		stack.push(40);
//		stack.push(90);
		System.out.println(stack);
//		Scanner size=new Scanner(System.in);
		int value=size.nextInt();
		int temp=0;
		while(!stack.isEmpty())
		{
			temp=0;
			int x=stack.pop();
			if(value==x)
			{
				temp=1;
				break;
			}
			else
			{
				temp=0;
			}
		}
			
		if(temp==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		
		
		
	}

}
