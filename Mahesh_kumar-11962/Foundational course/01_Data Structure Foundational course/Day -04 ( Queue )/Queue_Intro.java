package com.mahesh.ds_day4;
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
public class Queue_Intro {

	public static void main(String[] args) {
		// Queue Introduction
		Queue<String> queue_obj =new LinkedList<String>();
		//Insertion
		queue_obj.offer("First");
		queue_obj.offer("Next1");
		queue_obj.offer("Next2");
		queue_obj.offer("Last");
		System.out.println("Queue result: "+queue_obj);
		
		//remove the First <String>
		queue_obj.poll();
		System.out.println("Queue result: "+queue_obj);
		
		System.out.println("Queue Size result : "+queue_obj.size());//it return the size of the queue
		System.out.println("Queue peek result : "+queue_obj.peek());//it return the peek value/object
		System.out.println("Queue result is Empty : "+queue_obj.isEmpty());//it return the value as boolean
		System.out.println("Next1 is contain in Queue : "+queue_obj.contains("Next1"));//it return the value as boolean
		System.out.println("First is contain in Queue : "+queue_obj.contains("First"));//it return the value as boolean
		

	}

}
