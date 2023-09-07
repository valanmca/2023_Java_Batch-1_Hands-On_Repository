package com.gayathri.day4;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSize {

	public static void main(String[] args) {
	Queue <String> queue= new LinkedList <String> ();
	
	//insert
	queue.offer("A");
	queue.offer("B");
	queue.offer("C");
	queue.offer("D");
	queue.offer("E");
	queue.offer("F");	
	System.out.println(queue);
	
	int size = 0;
	while(!queue.isEmpty())//check whether queue is empty or not
	{
		queue.poll();//it will remove the front element 
		size++;//then increase 1
	}
	System.out.println("\nThe size of the queue : "+size);
	
	System.out.println("The queue elements "+queue);//after remove 
}
}
