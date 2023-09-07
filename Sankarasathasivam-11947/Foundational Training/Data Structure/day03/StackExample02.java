
//Searching the given element from the stack

package com.shiva.day03;

import java.util.Stack;
import java.util.Scanner;

public class StackExample02 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Check whether the stack is empty : "+stack.isEmpty());
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);

		System.out.println("Enter the element to be search");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		
		int temp=0;
		while(!stack.isEmpty())
		{
			temp=0;
			int input=stack.pop();
			if(input==s)
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
	
		
		//shortcut of this program
		/*boolean isPresent=false;
		while(!stack.isEmpty())
		{
			if(s==stack.pop()) {
			System.out.println("Yes it is Present");
			isPresent=true;
			break;
		}
		if(!boolean=true)
		{
			
		}*/
	}
	
}
