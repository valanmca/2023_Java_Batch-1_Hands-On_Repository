package com.jeban.day4;//ASCENTING ORDER PRIORITY
import java.util.Queue;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Queue4 {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>();
		//Inserting the element at end/rear
		queue.offer("D");
		queue.offer("B");
		queue.offer("A");
		queue.offer("C");
		queue.offer("E");

		System.out.println(queue);//[A,C,B,D,E]
		queue.poll();//Remove A
		System.out.println(queue);//[B,C,E,D]
		queue.poll();//Remove B
		System.out.println(queue);//[C,D,E]
		
		
		
		

	}

}
