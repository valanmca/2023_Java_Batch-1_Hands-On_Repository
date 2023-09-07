package com.madhan.day04;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.LinkedList;

public class QueueExample1 {

	public static void main(String[] args) {
//		Queue<String> queue=new LinkedList<String>();
////		 Inserting an element at Rear end
//		queue.offer("A");
//		queue.offer("D");
//		queue.offer("C");
//		queue.offer("B");
//		
//		System.out.println(queue);
		
		Queue<Integer> queue1=new PriorityQueue<Integer>(Comparator.reverseOrder());
//		 Inserting an element at Rear end
//		queue1.offer(4);
//		queue1.offer(2);
//		queue1.offer(1);
//		queue1.offer(3);
//		
//		System.out.println(queue1);
//		// Remove the first element from Front end
//		queue1.poll();
//		System.out.println(queue1);
////		
		queue1.poll();
		System.out.println(queue1);
//		System.out.println(queue.size());
//		
		System.out.println(queue1.peek()); //if we peek empty list,it shows null value.
//		
//		System.out.println(queue);
//		
//		System.out.println(queue.isEmpty());
//		
//		System.out.println(queue.contains("C"));

	}

}
