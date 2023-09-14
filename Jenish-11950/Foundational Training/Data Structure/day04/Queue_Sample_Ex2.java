package com.jenish.day04;

import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;

public class Queue_Sample_Ex2 {

	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>();
		//Inserting Element at END / REAR
				queue.offer(30);
				queue.offer(20);
				queue.offer(9);
				queue.offer(40);
				System.out.println("Enter the Values in Ascending");
				System.out.println(queue); //[9, 30, 20, 40]
				
				queue.poll();
				System.out.println(queue); //[20, 30, 40]
				
				queue.poll();
				System.out.println(queue); //[30, 40]
				
				queue.poll();
				System.out.println(queue+"\n"); //[40]
			
				
				Queue<Integer> reversequeue=new PriorityQueue<Integer>(Comparator.reverseOrder());
				reversequeue.offer(30);
				reversequeue.offer(20);
				reversequeue.offer(9);
				reversequeue.offer(40);
				System.out.println("Enter the Values in Descending");

				System.out.println(reversequeue); //[40, 30, 9, 20]
				
				reversequeue.poll();
				System.out.println(reversequeue); //[30, 20, 9]
				
				reversequeue.poll();
				System.out.println(reversequeue); //[20, 9]
				
				reversequeue.poll();
				System.out.println(reversequeue); //[9]
	}

}
