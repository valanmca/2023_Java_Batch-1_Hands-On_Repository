package com.dharshu.day3;

import java.util.Scanner;
import java.util.Stack;

public class SearchStack {

	public static void main(String[] args) {
		Stack<Integer>sk=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		
		//inserting the element in stack
		sk.push(10);
		sk.push(20);
		sk.push(30);
		sk.push(40);
		sk.push(50);
		
		System.out.println("The element in an stacks are :\n"+sk);
		//searching the element which is present in stack or not.
		System.out.println("Enter the element which you want to search:\n");
		int inputnum=sc.nextInt();
		int flag=0;
		while(!sk.isEmpty()) {
		
		if(inputnum==sk.pop()) {
			flag++;
			break;
		}
		
			else {
				flag=0;
			}
		}
		if(flag!=0) {
		System.out.println("The given number is present in stack");
		}
		else {
		System.out.println("The given number is not present in stack");
		}
	}
}
