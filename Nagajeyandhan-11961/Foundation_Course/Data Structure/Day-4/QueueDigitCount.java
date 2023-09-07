//Queue DigitCount

package com.jeyandhan.day04;

import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

import java.util.Scanner;

public class QueueDigitCount {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		
		System.out.println("Enter the values");
		
		for (int i=0;i<size;i++) {
			int temp = sc.nextInt();
			queue.offer(temp);
			
		}
		System.out.println(queue);
		for(int i=0;i<size;i++) {
			int count=0;
			int number = queue.poll();
			int temp = number;
			while(number > 0) {
				number = number/10;
				count++;
				
			}
			
			System.out.println("Total number of Digits in "+temp+":"+count);
			queue1.offer(count);
			
		}
		System.out.println(queue1);
	}

}
