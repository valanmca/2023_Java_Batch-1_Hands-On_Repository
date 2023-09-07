/************ Searching an Element in Dequeue Using LinkedList... ************/
package com.sara.day04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeExample2 {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);

		// Inserting Element at REAR
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);

		System.out.println("Enter The Element to Search : ");
		String number = sc.next();
		int sum = 0;

		while (!queue.isEmpty()) {
			String element = queue.poll();

			if (element.equals(number)) {
				System.out.println("True");
				sum++;
				break;
			}
		}
		if (sum == 0) {
			System.out.println("False");
		}

	}

}
