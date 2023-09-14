package com.jeban.day4;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.Scanner;

public class Dequesearch {

	public static void main(String[] args) {
		Deque<String> queue=new LinkedList<String>();
		//InsERTING ELEMENT
		int temp=0;
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println(queue);//[A,B,C,D]
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Value:");
		String n=sc.next();
		
		while(!queue.isEmpty()) {
			if(queue.pollFirst().equals(n)) {
				System.out.println("YES");
				temp++;
			}
		}
		if( temp==0){
			System.out.println("NO");
			
		}
			
		
	
		
	
		

	}

}
