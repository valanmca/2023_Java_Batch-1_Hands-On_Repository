package com.purushoth.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class ArrayDigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> countList = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("The number of array: ");
		int num = sc.nextInt();
		System.out.println("Enter the array value: ");

		for (int i = 0; i < num; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The list is" + list);

		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			int number = list.get(i);
			if(number==0) {
				count=1;
			}
			else {	
			while (number != 0) {
				number /= 10;
				count++;
			}
			}
			System.out.println("Total Number of digits in " + list.get(i) + ": " + count);
			countList.add(count);

		}
		System.out.println("The elements is the lists are: " + countList);

	}
}
