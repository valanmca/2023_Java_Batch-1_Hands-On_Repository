package DataStructureDay3;

import java.util.Scanner;
import java.util.Stack;

public class search2 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);

		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		int num = sc.nextInt();
		boolean isPresent = false;
		while (!stack.isEmpty()) {
			if (num == stack.pop()) {
				System.out.println("yes");
				isPresent = true;
				break;
			}
		}
		if (!isPresent)
			System.out.println("no");
	}
}
