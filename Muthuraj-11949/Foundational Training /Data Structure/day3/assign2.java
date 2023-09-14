package com.muthu.day3; 
import java.util.Scanner;
import java.util.Stack;

public class assign2{
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);	
		
		
		System.out.println(stack);
		System.out.print("Enter the fount number:");//
		int num=sc.nextInt();
		int temp=0;
	while(!stack.isEmpty()){
		
	if(stack.pop()==num) {

		System.out.println("Yes");
		temp++;
	}}
	if(temp==0);{
	System.out.println("no");
	
	}
	//SORTCUT
}
		
	}

