//count of the elements and store it in another queue
package com.domnic.day4;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class QueueEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		System.out.println("Enter the size of Queue :");
		int n = sc.nextInt();
		System.out.println("Enter the Elements :");
		for (int i = 0; i < n; i++) {
			queue1.add(sc.nextInt());
		}
		System.out.println(queue1);
		for (int i = 0; i <n; i++) {
			int count = 0;
			int values = queue1.poll();
			while (values!=0) {
				values = values / 10;
				count++;
			}
			queue2.offer(count);
			
		}
		System.out.println(queue2);

	}
}
