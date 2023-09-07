package com.mahesh.ds_day3;
import java.util.Stack;
public class Stack_Intro {

	public static void main(String[] args) {
	
		Stack<Integer> stack_obj = new Stack<Integer>();
		System.out.println(stack_obj);// stack is empty
		
		System.out.println(stack_obj.isEmpty());
		System.out.println("add some value into the stack : ");
		stack_obj.push(10);
		stack_obj.push(20);
		System.out.println(stack_obj);
		System.out.println("remove one value from stack : ");
		stack_obj.pop();
		stack_obj.pop();
		System.out.println(stack_obj);
		//add value
		System.out.print("Change the value:");
		//stack_obj.set(0, 1);
		//stack_obj.set(1, 2);
		
		for(int i=2;i<6;i++)
		{
			stack_obj.push(i);
		}
		System.out.println(stack_obj);
		
		
		

	}

}
