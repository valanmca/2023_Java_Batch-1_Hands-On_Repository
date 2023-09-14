package com.matthew.day03;
import java.util.Scanner;
import java.util.Stack;
public class stackInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Enter the length of the stack : ");
		int length = sc.nextInt();
		for (int i=0;i<length;i++) {
			int temp = sc.nextInt();
			stack.push(temp);
		}
		System.out.println("Stack : "+stack);
		String work = "yes";
		System.out.println("Do you want to do any operation 'yes' or 'no'");
		while (work=="yes") {
			System.out.println("Enter any of the following operation :");
			System.out.println("");
		}
	}

}
