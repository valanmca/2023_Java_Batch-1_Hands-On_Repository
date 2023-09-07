package DataStructureDay4;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class DequeueBasic {

	public static void main(String[] args) {
		Deque<String> queue=new LinkedList<String>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		System.out.println(queue);
		
		queue.offerFirst("Z");
		System.out.println("insert z as first " +queue);
		
		queue.offerLast("A");
		System.out.println("insert a as last "+queue);
		
		queue.pollFirst();
		System.out.println("removing the 1st element :" +queue);
		
		queue.pollLast();
		System.out.println("removing the last element :" +queue);
		
		System.out.println("enter a variable :");
		Scanner sc = new Scanner(System.in);
		String var=sc.next();
		queue.offerFirst(var);
		System.out.println(queue);

	}

}
