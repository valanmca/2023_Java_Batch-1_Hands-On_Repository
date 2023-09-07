package com.muthu.day4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class asendingorder {

	public static void main(String[] args) {
		 Queue<Integer> queue=new PriorityQueue<Integer>(Comparator.reverseOrder());
		 
		 //Inserting element at end /REAR
		 queue.offer(3);
		 queue.offer(2);
		 queue.offer(1);
		 queue.offer(4);
		 System.out.println(queue); // [1,2,3,4]    //[4,3,2,1]
		 
		 
		 
		 queue.poll(); //Remove first element from the FRONT D
		 System.out.println(queue);//[2,3,4] //[3,2,1]
		 
		 queue.poll(); //Remove first element from the FRONT 
		 System.out.println(queue);//[2,1]
		

	}

}
