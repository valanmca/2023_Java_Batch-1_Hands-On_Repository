package com.matthew.day07;
import java.util.ArrayList;
import java.util.Scanner;
public class SelectionSortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the list : ");
		int length = sc.nextInt();
		System.out.println("Enter the values :");
		for (int i = 0; i<length;i++) {
			list.add(sc.nextInt());
		}
		for(int i = 0;i<list.size();i++) {
			int min = i;
			for(int j = i;j<list.size();j++) {
				if (list.get(min) >list.get(j)) {
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min,temp);
		}
		System.out.println(list);
	}

}
