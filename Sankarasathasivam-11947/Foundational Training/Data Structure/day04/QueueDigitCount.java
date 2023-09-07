package com.shiva.day04;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueueDigitCount {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter the Elements :");
		
		for(int i=0;i<n;i++)
		{
			int value=sc.nextInt();
			queue.offer(value);
		}
		System.out.println("The given Values Are :"+queue);
	
		
		Queue<Integer> queue1=new LinkedList<Integer>();
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			int obj=queue.poll();
			count=0;
			
			while(obj!=0)
			{
				obj=obj/10;
				count++;
			}
			queue1.offer(count);
			
		}
		System.out.println("The count of Digits : "+queue1);
		
}
}