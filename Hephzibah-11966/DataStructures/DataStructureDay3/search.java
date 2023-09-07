package DataStructureDay3;

import java.util.Scanner;
import java.util.Stack;

public class search {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		Scanner sc = new Scanner(System.in);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		int num = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < stack.size(); i++) {
			if (num == stack.pop()) {
				flag = 0;
			} else {
				flag++;
			}

		}
		if (flag == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");

		}

	}

}
