package com.purushoth.day4;
import java.util.Queue;
import java.util.LinkedList;

public class QueueOfferPoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue=new LinkedList<String>();
	queue.offer("A");//The command is to insert the values
	queue.offer("B");
	queue.offer("C");
	queue.offer("D");
	System.out.println("The Queue is: "+queue);
	
	queue.poll();//TO delete the front value
	System.out.println(queue);
	
	System.out.println("Size of queue: "+queue.size());//To show the size
	System.out.println(queue.peek());// To display the front value
	System.out.println(queue);
	System.out.println(queue.isEmpty());//To check whether empty or not 
	System.out.println(queue.contains("B"));//To search
	
	}

}
