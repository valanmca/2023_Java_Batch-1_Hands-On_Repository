package DataStructureDay3;

import java.util.Scanner;
import java.util.Stack;
/*import java.util.LinkedList;*/

public class reverse {

	public static void main(String[] args) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		/*LinkedList<Integer> list = new LinkedList<Integer>();*/

		Scanner sc = new Scanner(System.in);

		stack1.push(10);
		stack1.push(20);
		stack1.push(30);

		System.out.println(stack1);

		while (!stack1.isEmpty()) {
			int n = stack1.pop();
			/*list.add(n);*/
			stack2.push(n);

		}
		System.out.println(stack2);

		// TODO Auto-generated method stub

	}

}
