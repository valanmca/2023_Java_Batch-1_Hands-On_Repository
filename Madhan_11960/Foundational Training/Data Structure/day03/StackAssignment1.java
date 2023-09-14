
// Find the size of the stack without using size() method.


package com.madhan.day03;
import java.util.Scanner;
import java.util.Stack;

public class StackAssignment1 {

	public static void main(String[] args) {
	  Stack<Integer> stack=new Stack<Integer>();
	  System.out.println("check whether stack is empty:" +stack.isEmpty());
	  stack.push(10);
	  stack.push(20);
	  stack.push(300);
	  System.out.println(stack);
	 
	  int count=0;
	  while(stack.isEmpty()!=true)   /*Another method [while(! stack.isEmpty())] */
	  {
		  stack.pop();
		  count++;
	  }
	   System.out.println("Size of the stack:"+ count);
	}
	

}
