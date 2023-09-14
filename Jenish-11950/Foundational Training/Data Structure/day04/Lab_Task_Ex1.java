package com.jenish.day04;

//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
import java.util.Scanner;

public class Lab_Task_Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Elements:");
		int value = sc.nextInt();
		System.out.println("Enter the Values of Lists:");
		for (int i = 0; i < value; i++) {
			int obj = sc.nextInt();
			values.add(obj);
		}
		System.out.println(values);
		ArrayList<Integer> values1 = new ArrayList<Integer>();
		for (int i = value - 1; i >= 0; i--) {
			int val = values.get(i);
			values1.add(val);
		}
		System.out.println("Reverse order list:" + values);
		int temp = 0;
		if (values.isEmpty() == true) {
			System.out.println("Palindrome");
		} else {
			for (int i = 0; i < value; i++) {
				temp = 0;
				int array1 = values1.get(i);
				int array2 = values.get(i);
				if (array1 == array2) {
					temp = 1;
				} else {
					temp = 0;
					break;
				}
			}
			if (temp == 0) {
				System.out.println("Not a Palindrome");
			} else {
				System.out.println("Palindrome");
			}
		}
		sc.close();

	}

}
