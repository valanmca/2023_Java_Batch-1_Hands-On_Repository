
package com.madhan.day03;
import java.util.Stack;

public class StackAssignment4 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Stack<Integer> stack1=new Stack<Integer>();
		 stack.push(100);
		 stack.push(500);
		 stack.push(30);
		 stack.push(90);
		 stack.push(700);
		 System.out.println(stack);
		 while(! stack.isEmpty())
		 {
			 int val=stack.pop();
			 stack1.push(val);
		 }
		System.out.println("The reverse stack is:"+stack1);

	}

}
