package com.jeban.day4;//DEQUE BASIC OPERATOR
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.Comparator;
import java.util.PriorityQueue;




public class Queue6 {

	public static void main(String[] args) {
		Deque<String> queue=new LinkedList<String>();
		//InsERTING ELEMENT
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println(queue);//[A,B,C,D]
		
		queue.offerFirst("Z");
		queue.offerLast("A");
		System.out.println(queue);//[Z,A,B,C,D,E,A]
		
		queue.pollFirst();
		queue.pollLast();
		System.out.println(queue);//[A,B,C,D,E]
		

		// TODO Auto-generated method stub

	}

}
