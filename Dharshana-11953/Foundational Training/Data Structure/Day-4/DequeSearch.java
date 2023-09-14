package com.dharshu.day4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeSearch {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		//In Dequeue,the insertion and deletion can be done from both side either front or end
		
		// inserting the element in normal way
		deque.offer("Baby");
		deque.offer("Cat");
		deque.offer("Dog");
		deque.offer("Egg");
		deque.offer("Fan");
		deque.offer("Gift");

		System.out.println("The elements in an queue is:\n" + deque);

		// insert the element at the front
		deque.offerFirst("Apple");
		//System.out.println("After inserting the elements in at first:\n" + deque);

		// insert the element at the end
		deque.offerLast("Home");
		System.out.println("After inserting the elements in at Last:\n" + deque);

		System.out.println("Enter the element which you want to search:\n");
		String val =sc.next();
		int flag=0;
		while(!deque.isEmpty()) 
		{
		
		if(val.equals(deque.poll())) {
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
