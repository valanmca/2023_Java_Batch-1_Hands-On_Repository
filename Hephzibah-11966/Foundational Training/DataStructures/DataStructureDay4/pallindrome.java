package DataStructureDay4;

import java.util.Queue;
import java.util.LinkedList;

public class pallindrome {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(8);
		list1.add(17);
		list1.add(9);
		list1.add(17);
		list1.add(8);
		list1.add(3);
		System.out.println(list1);
		int size = list1.size();
		for (int i = size - 1; i >= 0; i--) {
			int n = list1.get(i);
			list2.add(n);
		}
		System.out.println(list2);
		int flag = 0;
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) == list2.get(i))
				flag = 1;
			else {
				System.out.println("not a palindrome");		
				break;
			}
		}

		if (flag == 1) {
			System.out.println("Palindrome");
		}

	}
}
