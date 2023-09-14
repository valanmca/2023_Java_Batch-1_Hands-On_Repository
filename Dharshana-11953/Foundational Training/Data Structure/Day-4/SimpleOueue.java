package com.dharshu.day4;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleOueue {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		
		//Inserting the Element at End/REAR
		
		queue.offer("A");//offer() method is used to inserting the element
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		
		System.out.println("The elements are:"+queue);//[A,B,C,D,E]
		
		//remove the first element from the front
		queue.poll();
		System.out.println("The elements are:"+queue);//[B,C,D,E]
		
		System.out.println("The size of the Queue is:"+queue.size());//4
		
		System.out.println("The top element of the queue is:"+queue.peek());//display the top element[B]
		
		System.out.println("After peek the  elements are:"+queue);//[B,C,D,E]
		
		System.out.println(queue.isEmpty());//false Because the queue containing the element
		
		System.out.println(queue.contains("A"));//False Because the element "A"is not present in queue
		
		
		
		}

}
