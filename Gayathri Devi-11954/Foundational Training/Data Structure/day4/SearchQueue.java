package com.gayathri.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SearchQueue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue <String> queue = new LinkedList <String> ();
		
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		queue.offer("E");
		queue.offer("F");		
		System.out.println("\nThe initial queue : "+queue);
		System.out.println("\nEnter any element to be search : ");
		
		String search = sc.next();
		String val;
		int flag=0;
		while(!queue.isEmpty())
		{
			val=queue.poll();
			if(search.equals(val))	//string comparison
			{
				flag++;
				break;
			}
			else
				flag=0;
		}
		if(flag==0)
			System.out.println("The given string is not present in the Queue");
		else
			System.out.println("The given string is present in the Queue");
		
		

	}

}
