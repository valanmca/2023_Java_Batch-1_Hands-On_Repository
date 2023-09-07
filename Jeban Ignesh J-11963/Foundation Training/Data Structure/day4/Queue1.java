package com.jeban.day4;
import java.util.Queue;
import java.util.LinkedList;

public class Queue1 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.offer("apple");
		queue.offer("orange");
		queue.offer("banana");
		queue.offer("mango");
		queue.offer("graphs");
		System.out.println(queue);//insert the elements in queue
		queue.poll();//remove first element in the queue
		System.out.println(queue);
		System.out.println(queue.size());//find the size of queue
		System.out.println(queue.peek());//display the first or top element in the queue
		System.out.println(queue.isEmpty());//check wheter queue is empty or not
		System.out.println(queue.contains("mango"));// check given element in queue
		

	}

}
