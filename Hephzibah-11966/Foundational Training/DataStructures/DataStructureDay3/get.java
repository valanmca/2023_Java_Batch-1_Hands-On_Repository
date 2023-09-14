package DataStructureDay3;

import java.util.Scanner;
import java.util.Stack;

public class get {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements: ");
		int size = sc.nextInt();
		System.out.println("The Elements are: ");

		for (int i = 0; i < size; i++) {

			int num = sc.nextInt();
			stack.push(num);
		}
		System.out.println("The stack is :" + stack);
		// TODO Auto-generated method stub

	}

}
