//Deque Searching

package com.jeyandhan.day04;

import java.util.Scanner;

import java.util.Deque;

import java.util.LinkedList;

public class DequeSearching {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);

		// Inserting Element at End/Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");

		System.out.println("The elements in the Queue are: " + queue); // [A,B,C,D,E]

		queue.offerFirst("Z"); // Inserting Z at Front and A at Rear
		queue.offerLast("A");
		System.out.println("The elements in the Queue are: " + queue); // [Z,A,B,C,D,E]

		System.out.println("Enter the element to search");
		String search = sc.next();

		boolean isPresent = false;
		while (!queue.isEmpty()) {
			if (queue.poll().equals(search)) {
				isPresent = true;
				System.out.println("Yes it is present...");

				break;
			}
		}
		if (!isPresent) {
			System.out.println("It is not present...");
		}
	}

}
