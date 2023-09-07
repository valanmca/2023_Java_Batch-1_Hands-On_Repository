package com.aravind.day4; //find  the size of queue without size()

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueAss1 {

	public static void main(String[] args) {
		Queue<Character> queue=new LinkedList<Character>();
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			char str=sc.next().charAt(0);
			queue.offer(str);
		}
		
		
		/*queue.offer("A");//inserting element using offer
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");*/
		System.out.println(queue);
		System.out.println(queue.peek());
		
		int count=0;
		while(!queue.isEmpty())
		{
			count++;
			System.out.println(queue.poll());
			System.out.println(queue);
			
		}
System.out.println(count);
	}

}
