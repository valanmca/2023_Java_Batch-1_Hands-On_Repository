package com.swetha.day4;
import java.util.Queue;
import java.util.LinkedList;
public class Queue1 {

	public static void main(String[] args) {
		
		Queue<String>queue=new LinkedList<String>();
		
		//Adding elements at end of queue
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		
		System.out.println("After adding elements in the queue : "+queue);   //[A,B,C,D,E]
		
		//Remove the first element from front
		queue.poll();
		System.out.println("After removing the first element from the front :"+queue);
		
		//Dispalying the size
		System.out.println("The size of the queue is : "+queue.size());
		
		//Displaying the top element from the queue
		System.out.println("The Peek element is :"+queue.peek());
		
		System.out.println(queue);  //The queue elements
		
		System.out.println(queue.isEmpty());  //Checking queue is empty or not 
		
		System.out.println(queue.contains("A"));    //Checking queue contains the element "A"
		
		
		
		
		}

}
