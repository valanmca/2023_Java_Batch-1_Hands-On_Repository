package com.swetha.day4;
import java.util.Queue;
import java.util.LinkedList;
public class QueueSize {

	public static void main(String[] args) {
		
		//Finding the size of the queue without using size method
		Queue<String>queue=new LinkedList<String>();
		
	
		//Adding queue elements
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		int size=0;
		while(!(queue.isEmpty())) {
			queue.poll();
			size++;
		}
		System.out.println("The size of the queue is : "+size);
		
		
      
	}

}
