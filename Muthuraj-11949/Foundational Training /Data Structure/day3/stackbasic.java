package com.muthu.day3;
import java.util.Scanner;
import java.util.Stack;
import java.util.Stack;
public class stackbasic {
	public static void main(String[] args) {
		Stack<Integer>   stack=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("size:" +stack.size());
		System.out.println("is the stack is empty:"+stack.size());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);	
		System.out.println(stack);//[10,20,30,40]
		
		stack.pop();           //Remove the top Element i.e 40[pop]
		
		System.out.println(stack);//[10,20,30]
		
		System.out.println(stack.peek());// print the top element i.e 30
	
		System.out.println(stack);//[10,20,30]
		
		System.out.println("size:" +stack.size());//[3]
		System.out.println( stack .isEmpty());//false
		
		
		
		
		
		
		
		
	}


}
