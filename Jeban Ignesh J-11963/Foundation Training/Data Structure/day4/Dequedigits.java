package com.jeban.day4;
import java.util.Comparator;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.Scanner;

public class Dequedigits {
	public static void main(String[] args) {
		Queue<Integer> queue1=new LinkedList<Integer>();
		Queue<Integer> queue2=new LinkedList<Integer>();
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter The Value:");
		int n=sc.nextInt();
		for(int i=0; i<=n; i++) {
			
			queue1.add(sc.nextInt());
			
		}
		System.out.println(queue1);
		
		for(int i=0; i<n; i++) {
			int count=0;
			int number=queue1.poll();
			while(number!=0) {
				number=number/10;
				count++;
				}
			queue2.offer(count);
				System.out.println(count);
		
	}
	}
}

