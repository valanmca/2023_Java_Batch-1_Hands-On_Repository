package com.mahesh.ds_day4;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Deque;
public class DeQue_Intro {

	public static void main(String[] args) {
		
		Deque<String>DQ_obj = new LinkedList<String>();
		DQ_obj.offer("A");
		DQ_obj.offer("B");
		DQ_obj.offer("C");
		DQ_obj.offer("D");
		DQ_obj.offer("E");
		System.out.println("Deque is:"+DQ_obj);
		System.out.println("Insert First:");
		DQ_obj.offerFirst("A1");
		System.out.println("Deque is:"+DQ_obj);
		System.out.println("Insert First:");
		DQ_obj.offerFirst("A0");
		System.out.println("Deque is:"+DQ_obj);
		System.out.println("Insert Last:");
		DQ_obj.offerLast("Z");
		System.out.println("Deque is:"+DQ_obj);
		System.out.println("Insert Last:");
		DQ_obj.offerLast("Z1");
		System.out.println("Deque is:"+DQ_obj);

		

	}

}
