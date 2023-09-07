package com.shaji.Day04;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

public class Deque_Assign1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<String> queue = new LinkedList<String>();
		
		// Adding the Elements
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		queue.offer("F");
		queue.offer("G");

		
		System.out.println("The Elements are " + queue);
		
		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println("The Elements are " + queue);
		
		System.out.println("Enter the Element to search : ");
		String value = sc.next();
		int sum=0;
		
		while(!queue.isEmpty()) {
		String val = queue.poll();
		
		if(val.equals(value)) {
			System.out.println("The Value is Present...");
			sum++;
			break;
		}
		
	}
		if(sum==0) {
			System.out.println("The Value is Absent...");
		}

	}

}
