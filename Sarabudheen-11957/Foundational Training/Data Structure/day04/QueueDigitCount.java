/******* Counting the No.of.Digit Using Queue... *******/
package com.sara.day04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDigitCount {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The List Size : ");
		int size = sc.nextInt();
		System.out.println("Enter The Elements : ");
		for (int i = 0; i < size; i++) {
			int element = sc.nextInt();
			queue1.offer(element);
		}
		System.out.println("The Elements in the Queue : " + queue1);

		for (int i = 0; i < size; i++) {
			int count = 0;
			int num = queue1.poll();
			int temp = num;
			while (num != 0) {
				num /= 10;
				count++;
			}
			queue2.offer(count);
			System.out.println("Number of Digit in " + temp + " is : " + count);
		}

		System.out.println("The DigitCount Queue : " + queue2);

	}
}