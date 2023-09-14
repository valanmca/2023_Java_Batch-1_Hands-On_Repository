package com.jeban.day2;

import java.util.LinkedList;
import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println("Size:" + list1.size());
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Number:");
			for (int i = 0; i < 5; i++) {

				list1.add(sc.nextInt());

			}
			System.out.println("list:" + list1);
		}
		LinkedList<Integer> EL = new LinkedList<Integer>();
		LinkedList<Integer> OL = new LinkedList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) % 2 == 0) {
				EL.add(list1.get(i));

			} else {
				OL.add(list1.get(i));
			}

		}
		System.out.println("Even List:" + EL);
		System.out.println("ood List:" + OL);

	}

}
