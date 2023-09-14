package com.swetha.day3;
import java.util.Scanner;
import java.util.Stack;
public class StackSearch {

	public static void main(String[] args) {
		//Search an element in the stack without using index (by using push,pop,and isEmpty)
		
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		//Getting a number from user to search
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number to search in the stack : ");
		int num=sc.nextInt();
		
		
		/*Another method to search element from top 
        if(stack.contains(num)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}    */
		
		
		int flag=0;                      
		while(!(stack.isEmpty())) {
			if(stack.pop()==num) {
				flag=1;                 
				System.out.println("Yes");
				break;
			}

       }
		if(flag==0) {
			System.out.println("No");
	    }
}
	
}
