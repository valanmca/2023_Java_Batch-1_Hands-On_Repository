package com.dharshu.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountQueue {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Queue<Integer> queue1=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range :");
		int queue_size = sc.nextInt();
		System.out.println("Enter the " + queue_size + " of the element:");
		for (int i = 0; i < queue_size; i++) {
			int num1 = sc.nextInt();
			queue.offer(num1);
		}
		System.out.println("The elements in an queue is:" + queue);
		
		for(int i=0;i<queue_size;i++) {
			int count=0;
			int num1=queue.poll();
			
			while (num1 > 0) {
				num1 = num1 / 10;
				count++;

			}
			System.out.println("Total no.of digits:" + count);
			queue1.offer(count);

		}
		System.out.println("The elements in an list is:" + queue1);

		}
		


}
