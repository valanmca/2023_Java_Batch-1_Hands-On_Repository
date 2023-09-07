package com.muthu.day4;
import java.util.Deque;
import java.util.LinkedList;
import java.util.LinkedList;

public class dequemethod {

	public static void main(String[] args) {
		Deque<Integer> queue=new LinkedList<Integer>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		
		System.out.println(queue);//[1,2,3,4]
		
		
		queue.offerFirst(5);
		queue.offerLast(10);
		System.out.println(queue);//[5,1,2,3,4,5,10]
		
		
		queue.pollFirst();//Remove 5
		
		queue.pollLast();// Remove 10
		System.out.println(queue);//[1,2,3,4,5]
	}

}
