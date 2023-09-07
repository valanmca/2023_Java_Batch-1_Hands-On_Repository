package com.muthu.day4;
import java.util.Queue;
import java.util.LinkedList;
public class queue {
	public static void main(String[] args) {
	 Queue<String> queue=new LinkedList<String>();
	 //Inserting element at end /REAR
	 
	 queue.offer("A");
	 queue.offer("B");
	 queue.offer("C");
	 queue.offer("D");
	 System.out.println(queue); // [A,B,C,D]
	 queue.poll(); //Remove first element from the FRONT
	 System.out.println(queue);//[B,C,D]
	 
	 System.out.println(queue.size());//3
	 System.out.println(queue.peek());//B
	 System.out.println(queue);//[B,C,D]
	 System.out.println(queue.isEmpty());
	 System.out.println(queue.contains("C"));//FALSE
	}
	

}
