//Queue Searching

package com.jeyandhan.day04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSearching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();
		
		// Inserting Element at End/Rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println("The elements in the Queue are: " + queue);

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
