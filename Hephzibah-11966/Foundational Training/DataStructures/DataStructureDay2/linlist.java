package DataStructureDay2;

import java.util.Scanner;

import java.util.LinkedList;


public class linlist {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int num = 1; num <= 10; num++) {
			list1.add(num);
		}
		System.out.println("list1 is:" + list1);

		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for (int num = 0; num < 10; num++) {
			list2.add(list1.get(num) * n);
		}
		System.out.println("list2 is:" + list2);
		for (int i = 0; i < 10; i++) {
			System.out.println(list1.get(i) + "*" + n + "=" + list2.get(i));
		}

	}

}
