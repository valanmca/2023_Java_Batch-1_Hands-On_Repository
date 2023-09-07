package com.jeban.day4;//
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class Queue3 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		int temp = 0;
		queue.offer("cat");
		queue.offer("dog");
		queue.offer("lion");
		queue.offer("tiger");
		queue.offer("elephant");
		System.out.println(queue);
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number:");
		String number=sc.next();

		
		while (!queue.isEmpty()) {
			if (queue.poll().equals( number)) {
				System.out.println("yes");
				temp++;
			}

		}
		if (temp == 0) {
			System.out.println("no");
		}
//		if(queue.contains(n))
//			System.out.println("yes");
//		else
//			System.out.println("No");
//
//	}
//		
				
			}
		
		

	}


