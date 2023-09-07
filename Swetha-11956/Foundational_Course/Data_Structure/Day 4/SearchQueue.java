package com.swetha.day4;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class SearchQueue {

	public static void main(String[] args) {
		
		//Searching element in the queue using (isEmpty(),poll(),offer()
		
		Queue<String>queue=new LinkedList<String>();
		
		//Adding elements in the queue
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to search : ");
		String var=sc.next();
		
		int flag=0;
		while(!queue.isEmpty()) {
			if(var.equals(queue.poll())) {		
				flag=1;
			}
		}
			
		if(flag==0) {
			System.out.println("NO, The searching element is not present");
			
		}
		else {
			System.out.println("YES, The searching element is present ");
		}

	

}
}
