package com.purushoth.day4;
import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> queue= new LinkedList<String>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println("The Deque is: "+queue);
		
		queue.offerFirst("Y");//To insert in first.
		queue.offerLast("G");//To insert in last.
		System.out.println(queue);
		
		queue.pollFirst();//To delete in first.
		queue.pollLast();//To delete in last.
		System.out.println(queue);
		

	}

}// Deque operations
