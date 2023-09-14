package DataStructureDay2;

import java.util.LinkedList;

import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no of elements:");
		int n = sc.nextInt();
		
		System.out.println("enter the elements:");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list1.add(num);
		}
		System.out.println("list is" + list1);

		for (int i = 0; i < list1.size(); i++) {
			int count = 0;
			int m = list1.get(i);
			while (m != 0) {
				m = m / 10;
				count++;
			}
			list2.add(count);
		}

		System.out.println("counted digits" + list2);

		for (int i = 0; i < n; i++) {
			System.out.println("Total no of digits" + list1.get(i) + ":" + list2.get(i));
		}
	}
}
