package com.aravind.day4;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class QueueDigitcountAss4 {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of size");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int val = sc.nextInt();
			queue.offer(val);
		}

		System.out.println(queue);
		Queue<Integer> digit = new LinkedList<Integer>();

		int count ;
		for (int i = 0; i < size; i++) {
			int temp;
			temp = queue.poll();
			if (temp == 0) {
				count = 1;

			} else {
				count=0;
				while (temp != 0) {
					count = count + 1;
					temp /= 10;

				}

			}
			digit.offer(count);

		}
		System.out.println(digit);

	}

}
