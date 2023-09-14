package com.mahesh.ds_day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Count {

	public static void main(String[] args) {
		Queue<Integer> q_obj = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			q_obj.offer(sc.nextInt());
		}
		// System.out.println("Stack is :" + q_obj);
		System.out.println("Queue Result is :" + q_obj);
		int count = 0;
		while (!q_obj.isEmpty()) {
			q_obj.poll();
			count++;
		}
		System.out.println("Queue Count Result is :" + count);

	}

}
