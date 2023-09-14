package com.mahesh.ds_day4;
import java.util.*;
public class Priority_Queue_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> obj = new PriorityQueue<Integer>();
	
		obj.offer(10);
		obj.offer(79);
		obj.offer(29);
		obj.offer(80);
		obj.offer(5);
	
		System.out.println(obj);//[5,10,79,29,80] single value can achive the priority
		
		System.out.println("poll element :"+obj.poll());
		System.out.println("Output : "+obj);
		System.out.println("poll element :"+obj.poll());
		System.out.println("Output : "+obj);
		System.out.println("poll element :"+obj.poll());
		System.out.println("Output : "+obj);
		System.out.println("poll element :"+obj.poll());
		System.out.println("Output : "+obj);
		System.out.println("poll element :"+obj.poll());
		
		
		
			}

}
