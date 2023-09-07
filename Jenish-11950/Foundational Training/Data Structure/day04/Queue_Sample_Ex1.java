package com.jenish.day04;  

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Sample_Ex1 {

	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		//Inserting Element at END / REAR
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		queue.offer("4");
		System.out.println(queue); //[1,2,3,4]
		
		queue.poll(); //Remove First Element From The FRONT
		System.out.println(queue); //[2,3,4]
		
		System.out.println(queue.size()); //3
		
		System.out.println(queue.peek()); //Displaying 1st Index: 2
		
		System.out.println(queue); //[2,3,4]
		
		System.out.println(queue.isEmpty()); //False 
		
		System.out.println(queue.contains("1")); //False
		
		
		
	}

}
