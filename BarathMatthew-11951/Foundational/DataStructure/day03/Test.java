
package com.matthew.day03;
import java.util.Scanner;
import java.util.Stack;
public class Test {

	public static void main(String[] args) {
		int coll[] = {10,20,304,50,89,90,67,89,90};
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0;i<coll.length;i++) {
			stack.push(coll[i]);
		}
		System.out.println(stack);
	}

}
