package com.naveen.day6;
//Binary Search Algorithm using ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class SearchEx05 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println(list);

		System.out.println("Enter the Element to Search :");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		int beg = 0;
		int end = list.size() - 1;
		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			int s = list.get(i);
			while (s == k) {
				int mid = (beg + end) / 2;
				System.out.println("Element present in the index : " + i);

				if (s < k) {
					beg = mid + 1;
				} else if (s > k) {
					end = mid - 1;
				}
				flag = true;
				break;

			}
		}

		if (flag == false) {
			System.out.println("Not Found");
		}
		sc.close();
	}

}
