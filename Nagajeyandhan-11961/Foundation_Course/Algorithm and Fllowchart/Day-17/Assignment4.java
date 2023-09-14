package com.jeyandhan.assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		list.add(14);
		list.add(67);
		list.add(13);
		list.add(15);
		list.add(4);

		System.out.println(list);
		System.out.println("Enter the value to be search ");
		int search = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (search == list.get(i)) {
				System.out.println("The element is present at " + i + " index");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(-1);
		}

	}

}
