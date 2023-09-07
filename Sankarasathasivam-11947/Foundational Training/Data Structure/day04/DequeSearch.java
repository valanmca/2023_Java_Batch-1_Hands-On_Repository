package com.shiva.day04;

//import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeSearch {

	public static void main(String[] args) {
		Deque<String> queue = new LinkedList<String>();

		// Inserting Element at end/rear
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		queue.offer("D");
		System.out.println("The List to be printed :"+queue);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		String n=sc.next();
		int temp=0;
		while(!queue.isEmpty())
		{
			temp=0;
			String str=queue.pollLast();
			
			if(n.equals(str))
			{
				temp=1;
				break;
			}
			else
			{
				temp=0;
			}
		}
		if(temp==1)
		{
			System.out.println("The Value is Found");
		}
		else 
		{
			System.out.println("The Value is Not Found");
		}

	}

}
