//searching element in dequeue
package com.domnic.day4;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class DeQueueEx2 {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        int temp=0;
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		queue.offer("f");

		System.out.println(queue);
		queue.offerFirst("starting");   //adding on front
		queue.offerLast("ending");
		System.out.println();
		System.out.println(queue);
		
		System.out.println("Enter the element to be found :");
		String element=sc.next();
		
		while(!queue.isEmpty()) {
			if(queue.poll().equals(element))
			{
				System.out.println("Yes");
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("no");
		}

	}

}
