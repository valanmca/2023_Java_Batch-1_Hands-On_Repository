package com.jenish.day04;
import java.util.Deque;
import java.util.LinkedList;

public class Dequeue_Sample_Ex1 {

	public static void main(String[] args) {
		Deque<String> queue=new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println("Enter the Values in Deque");
		System.out.println(queue); //[A, B, C, D]
		
		queue.offerFirst("Z");//["Z", A, B, C, D]
		queue.offerLast("A");//[Z, A, B, C, D, "A"]
		System.out.println(queue); //[Z, A, B, C, D, A]
		
		queue.pollFirst();//[Remove Z]
		queue.pollLast();//[Remove A]
		System.out.println(queue); //[A, B, C, D]
		

	}

}
