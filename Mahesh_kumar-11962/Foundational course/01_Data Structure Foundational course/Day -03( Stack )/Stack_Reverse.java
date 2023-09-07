package com.mahesh.ds_day3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			stack.push(sc.nextInt());
		}
		System.out.println("Stack is :" + stack);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < range; i++) {
			list.add(stack.pop());
		}
		System.out.print("Reverse stack : "+list);
		

	}

}
