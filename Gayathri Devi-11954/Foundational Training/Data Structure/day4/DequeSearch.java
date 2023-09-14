package com.gayathri.day4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeSearch {

	public static void main(String[] args) {
		
		Deque <String> queue = new LinkedList <String> ();
		//insertion & deletion can be done in both front & rear end
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Carrot");
		queue.offer("Deer");
		queue.offer("Elephant");
		queue.offerFirst("Zip");
		queue.offerFirst("Window");
		queue.offer("Xerox");
		queue.offerLast("Potato");
		queue.offerLast("Queen");
		System.out.println(queue);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String search = sc.next();
		int flag=0;
		while(!queue.isEmpty())
		{
			if(search.equals(queue.pollFirst()))
			{
				flag++;
				break;
			}
			else
				flag=0;
		}
		if(flag==0)
			System.out.println("The given string not is present");
		else
			System.out.println("The given string is present");


	}

}
