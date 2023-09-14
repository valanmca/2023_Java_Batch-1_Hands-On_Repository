package com.aravind.day4;
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample1 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		System.out.println(queue.size());
		
		queue.offer("A");//inserting element using offer
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println(queue);
		System.out.println(queue.size());
		queue.poll();//  remove the first element from the front
		System.out.println(queue);
		System.out.println(queue.size());// display the size of the queue
		System.out.println(queue.peek());//if we peek empty list null is value
		System.out.println(queue);
		System.out.println(queue.isEmpty());//false
		System.out.println(queue.contains("A"));//false
		
		
		
  
	}

}
