package com.mahesh.ds_day4;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Reverse {

	public static void main(String[] args) {
		
		Queue<Integer> RQ_obj = new PriorityQueue<Integer>(Comparator.reverseOrder());
		RQ_obj.offer(10);
		RQ_obj.offer(5);
	
		RQ_obj.offer(80);
		RQ_obj.offer(79);
		RQ_obj.offer(29);
	
		
		System.out.println("\nReverse Order");
		System.out.println(RQ_obj);//[80,79,10,5,29] single value can achive the priority
		
		System.out.println("\npoll element :"+RQ_obj.poll());
		System.out.println("Output : "+RQ_obj);
		System.out.println("poll element :"+RQ_obj.poll());
		System.out.println("Output : "+RQ_obj);
		System.out.println("poll element :"+RQ_obj.poll());
		System.out.println("Output : "+RQ_obj);
		System.out.println("poll element :"+RQ_obj.poll());
		System.out.println("Output : "+RQ_obj);
		System.out.println("poll element :"+RQ_obj.poll());


	}

}
