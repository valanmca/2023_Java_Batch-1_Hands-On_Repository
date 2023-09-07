package com.gayathri.day3;

import java.util.Scanner;
import java.util.Stack;

public class SearchStack {

	public static void main(String[] args) {
		Stack<Integer> stackobj = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		// insert
		stackobj.push(100);
		stackobj.push(200);
		stackobj.push(300);
		stackobj.push(400);
		stackobj.push(500);
		stackobj.push(600);

		System.out.println("\nThe stack elements are....." + stackobj);

		System.out.println("\nGive one number : ");
		int num = sc.nextInt();
		int popelement;
		int flag = 0;
		while (!stackobj.isEmpty()) {
			popelement = stackobj.pop();
			if (num == popelement) {
				flag++;
				break;
			} else {
				flag = 0;
			}
		}
		if (flag != 0)
			System.out.println("The given number is present in the stack");
		else
			System.out.println("The given number is not present in the stack");

		/*
		 * //another method if(stackobj.contains(num))
		 * System.out.println("The given number is present in the stack");
		 */		
sc.close();

	}

}
