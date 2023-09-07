package com.swetha.day4;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class DequeSearch {

	public static void main(String[] args) {
		
		//Searching an element in Deque
		Deque<String>queue=new LinkedList<String>();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println("The queue elements are : "+queue);
		
		Scanner sc=new Scanner(System.in);
		String var=sc.next();
		
		int flag=0;
		while(!queue.isEmpty()) {
			if(var.equals(queue.poll())) {		
				flag=1;
				System.out.println("YES, The searching element is present ");
				break;
			}
		}
			
		if(flag==0) {
			System.out.println("NO, The searching element is not present");
			
		}
		
	}

}
