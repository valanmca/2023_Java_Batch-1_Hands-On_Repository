package com.madhan.day03;
import java.util.Stack;
import java.util.Scanner;

public class StackExample2 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Scanner size=new Scanner(System.in);
		int value=size.nextInt();
		for(int i=0;i<value;i++)
		{
			stack.pop(); //emptystack exception
			stack.peek();
			int element=size.nextInt();
			
			stack.push(element);
		}

	}

}
