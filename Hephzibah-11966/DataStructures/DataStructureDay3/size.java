package DataStructureDay3;     //Finding the size of the stack without using size()

import java.util.Scanner;
import java.util.Stack;

public class size {   

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack);
		int count = 0;
		
		while (!stack.isEmpty()) {

			stack.pop();
			count++;

		}
		System.out.println(count);

		// TODO Auto-generated method stub

	}

}
