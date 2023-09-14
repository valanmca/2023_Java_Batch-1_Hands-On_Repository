package com.jenish.day04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Dequeue_Sample_Task1 {

	public static void main(String[] args) {
		Deque<Integer> dequeue=new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Value:");
		int value= sc.nextInt();
		
		System.out.println("Enter the Elements:");
		//boolean flag=false;
		for(int i=0; i<value; i++) {
			dequeue.offer(sc.nextInt());
		}
		System.out.println("Deque:" +dequeue);
		sc.close();
	}

}
