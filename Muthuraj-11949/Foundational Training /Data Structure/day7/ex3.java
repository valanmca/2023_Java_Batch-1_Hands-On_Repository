package com.muthu.day7;
import java.util.Scanner;
import java.util.LinkedList;

public class ex3 {

	public static void main(String[] args) {
		LinkedList<Integer> 	list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of list");
		int num=sc. nextInt();
		int temp = 0;
		System.out.println("Enter the list elements ");
		for (int i = 0; i < num; i++) {
			int num1 = sc.nextInt();
			list.add(num1);
		}

		{
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num - 1; j++) {
					if (list.get(j) > list.get(j+1)) {
						temp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, temp);
					}
				}
			}
			System.out.println("Sorted list");
			for (int i = 0; i < num; i++) {
				System.out.println(list.get(i));
			}
		}
		


	}

}

