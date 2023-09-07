package com.naveen.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx02 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range :");
		int range = sc.nextInt();

		System.out.println("Enter The List Values :");
		for (int i = 0; i < range; i++) {
			
			String n = sc.next();
			queue.offer(n);
		}

		System.out.println(queue);
		
		System.out.println("The Element to be Searched :");
		String s = sc.next();
		
		boolean isPresent = false;
		while(!queue.isEmpty()) {
			if(s.equals(queue.poll())){         //In  the case of String use equals() method.
				System.out.println("Yes!");
				isPresent=true;
				break;
			}
		}
		if(!isPresent) {
			System.out.println("No!");
		}
		sc.close();

	}

}

