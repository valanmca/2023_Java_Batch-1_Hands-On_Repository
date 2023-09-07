package com.shaji.Day04;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Assign2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");// Adding the Elements
		
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
