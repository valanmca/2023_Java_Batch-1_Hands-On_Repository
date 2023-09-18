//Palindrone Programs using the LinkedList
package com.pravinkumar.day4;

import java.util.Scanner;
import java.util.LinkedList;

public class Palindrone_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> array = new LinkedList<Integer>();
		LinkedList<Integer> arrays = new LinkedList<Integer>();
		System.out.println("Enter the Size of the List:");
		int lists = sc.nextInt();

		System.out.println("Enter the List:");
		int temp;
		for (int i = 0; i < lists; i++) {
			temp = sc.nextInt();
			array.add(temp);
		}
		System.out.println(array);
		for (int i = 1; i <= lists; i++) {
			arrays.add(array.remove(lists - i));
		}
		System.out.println(arrays);
		int flag = 0;
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == arrays.get(i)) {
				flag = 1;
				continue;
			} else {
				flag = 0;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Its is a Palindrone:");
		} else {
			System.out.println("Its is not a Palindrone:");
		}
	}
}
