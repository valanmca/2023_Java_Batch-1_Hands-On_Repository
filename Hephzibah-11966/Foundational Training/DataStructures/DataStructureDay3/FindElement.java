package DataStructureDay3;

import java.util.Scanner;
import java.util.Stack;

public class FindElement {

	public static void main(String[] args) {
Stack<Integer> stack = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("the stack is :" +stack);
		
		stack.pop()	;
		stack.pop();
		System.out.println("2nd element is :" +stack.peek());
		System.out.println("the stack is :" +stack);

	}

}
