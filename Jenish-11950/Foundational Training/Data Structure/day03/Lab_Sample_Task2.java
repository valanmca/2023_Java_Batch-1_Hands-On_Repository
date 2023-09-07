package com.jenish.day03; 
//Searching the given element from the stack. [Note: push(), isEmpty() & pop()] 
import java.util.Scanner;
import java.util.Stack;
public class Lab_Sample_Task2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Values Of Stack:" );
		
		stack.push(11);//Adding the stack elements
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		stack.push(16);
		
		System.out.println(stack);
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Values of num:");
		int num=sc.nextInt();
		int temp=0;
		while(!stack.isEmpty()) {
			temp=0;
			int value=stack.pop();
			if(value==num) {
				temp=1;
				break;
			}
			else
			{
				temp=0;
			}
		}
				if(temp==1) {
					System.out.println("Yes");
				}
				else
				{
					System.out.println("No");
				}	
				sc.close();
		}

	}


