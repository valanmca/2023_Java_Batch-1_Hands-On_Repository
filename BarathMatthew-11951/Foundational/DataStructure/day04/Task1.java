//Singular queue
package com.matthew.day04;
import java.util.Queue;
import java.util.LinkedList;
public class Task1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		//inserting element at the end(offer)
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println(queue);
		//Remove the first element from the queue(poll)
		queue.poll();
		System.out.println(queue);
		
		System.out.println("Size of queue : "+queue.size());
		System.out.println("Displaying the first element : "+queue.peek());
		System.out.println("Displaying the list : "+queue);
		System.out.println("checking is empty : "+queue.isEmpty());
		System.out.println("Checking an element present in the list: "+queue.contains("B"));
	}

}
