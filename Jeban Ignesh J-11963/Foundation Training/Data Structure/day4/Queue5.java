package com.jeban.day4;///Decending order priority

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue5 {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<String>(Comparator.reverseOrder());
		//Inserting the element at end/rear
		queue.offer("D");
		queue.offer("B");
		queue.offer("A");
		queue.offer("C");
		queue.offer("E");

		System.out.println(queue);//[E,D,C,B,A]
		queue.poll();//Remove E
		System.out.println(queue);//[D,C,B,A]
		queue.poll();//Remove D
		System.out.println(queue);//[C,B,A]
		

	}

}
