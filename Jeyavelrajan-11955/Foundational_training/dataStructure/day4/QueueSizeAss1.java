//Find the Queue size without using size()

package com.jeyavel.day4;
import java.util.Queue;
import java.util.LinkedList;
public class QueueSizeAss1 {
 public static void main(String []args) {
	 Queue<Integer> queue = new LinkedList<Integer>();

	 queue.offer(10);
	 queue.offer(20);
	 queue.offer(30);
	 queue.offer(40);
	 queue.offer(50);
	 
	 int temp=0;
	 while(!queue.isEmpty()) {
		 temp++;
		 queue.poll();
		 
	 }
	 System.out.println("the size of queue = "+temp);
 }
}
