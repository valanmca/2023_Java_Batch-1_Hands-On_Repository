package com.dharshu.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchQueue {
    //Searching the given element from the queue
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		
		System.out.println("The elements in an queues are:"+queue);
		
		System.out.println("Enter the element which you want to search:\n");
		String val =sc.next();
		int flag=0;
		while(!queue.isEmpty()) 
		{
			
		
		if(val.equals(queue.poll())) {
			flag++;
			break;
		}
		
			else {
				flag=0;
			}
		}
		if(flag==0) {
		System.out.println("The given element is not present in queue");
		}
		else {
		System.out.println("The given element is  present in queue");
		}
	

	}

}
