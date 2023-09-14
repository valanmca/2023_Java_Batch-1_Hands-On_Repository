package com.shaji.Day04;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Assign1 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		int size=0;
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		System.out.println("The Elements are " + queue);

		while(!queue.isEmpty()) {
			queue.poll();
			size++;
		}
				
		/*boolean work = true;
		System.out.println("The Elements are " + queue);
		while(work) {
			if(queue.isEmpty()) {
				work=false;
			}
			else {
				 size+= 1;
				queue.poll();
			
			}// method to know
		}*/
		
		System.out.println("The Size of the Elements : " + size);
		 

	}

}
