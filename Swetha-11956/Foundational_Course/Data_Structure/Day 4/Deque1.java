package com.swetha.day4;
import java.util.Deque;
import java.util.LinkedList;
public class Deque1 {

	public static void main(String[] args) {
		
		//Deque---Insert and delete elements at both ends
		
		Deque<String>queue=new LinkedList<String>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println("The queue elements are : "+queue);
		
		//Inserting elements at the first
		queue.offerFirst("Z");    //[Z,A,B,C,D]
		System.out.println("Inserting Z at the first: "+queue);
		
		//Inserting elements at teh last
		queue.offerLast("X");    // [Z,A,B,C,D,X]
		System.out.println("Inserting X at the last : "+queue);
		
		
		//Deleting elements at the first
		queue.pollFirst();
		System.out.println("Deleting first element : "+queue);
		
		//Deleting elements at last
		queue.pollLast();
		System.out.println("Deleting last element : "+queue);

	}

}
