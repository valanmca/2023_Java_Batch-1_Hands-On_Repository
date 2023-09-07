//basic operations on queue
package com.domnic.day4;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueueEx1 {

	public static void main(String[] args) {
	Queue<String> queue=new LinkedList<String>();
	queue.offer("Hi");
	queue.offer("queue");          //inserting elements
	queue.offer("hello");
	queue.offer("java");
	System.out.println(queue);
	System.out.println();
	
	queue.poll();                      //removing the first element
	System.out.println(queue);
	System.out.println(queue.size());
	queue.offer("data structure");
	System.out.println(queue);
	System.out.println(queue.peek());
	System.out.println("isEmpty "+queue.isEmpty());
	System.out.println("Enter the string to be found:");
	Scanner sc=new Scanner(System.in);
	String element=sc.next();
	System.out.println(queue.contains(element));
	
	

	}

}
