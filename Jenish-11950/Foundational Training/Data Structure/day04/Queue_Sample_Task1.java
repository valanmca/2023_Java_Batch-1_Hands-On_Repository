package com.jenish.day04;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Queue_Sample_Task1 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the values");
		int value= sc.nextInt();
	
		System.out.println("Enter your Element:");
		for(int i=0; i<value; i++) {
			queue.offer(sc.next());
		}
		System.out.print("Queue output:" +queue);
		int count=0;
		while(!queue.isEmpty()) {
			queue.poll();
			count++;
		}
		System.out.print("\nResult:" +count);
		sc.close();	
		}
	
		
	}


