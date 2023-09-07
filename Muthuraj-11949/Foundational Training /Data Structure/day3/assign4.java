package com.muthu.day3;

import java.util.Stack;

public class assign4 {
	public static void main(String[] args) {
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		stack1.push(10);
		stack1.push(20);
		stack1.push(30);
		stack1.push(40);	
		System.out.println(stack1);
		//[10,20,30,40]
		while(!stack1.isEmpty()){
		stack2.push(stack1.pop());
		
	}
	System.out.println(stack2);
}


}