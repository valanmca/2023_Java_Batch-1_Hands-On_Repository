//searching the given element from the stack.[NOTE: use push(),isEmpty& pop()]
package com.jeyavel.day3;
import java.util.Stack;
import java.util.Scanner;
public class SearchinStack {

	public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	System.out.println("The default stack order is "+stack);
	
	System.out.println("Enter your input");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	int stackNo = sc.nextInt();
	
	System.out.println("The user Enter imput is "+ stackNo);
	
	boolean flag = false;
	while(!stack.isEmpty()) {
		if(stack.pop()==stackNo) {
			System.out.println("It is Present the user input is = "+ stackNo);
		  flag = true;
		  break;
	}
	if(!flag) {
		System.out.println(stackNo+"No it is not Present");
	}
//		System.out.println("The Stack output is "+ flag + "= Stack no " + stack.size());	

	}

}



}