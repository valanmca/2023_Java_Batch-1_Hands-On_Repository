package com.madhan.day04;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class QueuedigitcountAssignment3 {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int number=sc.nextInt();
			queue.offer(number);
		}
		System.out.println(queue);
         Queue<Integer> queue1=new LinkedList<Integer>();
         int count=0;
         for(int i=0;i<size;i++)
         {
        	 int temp=queue.poll();
        	 if(temp==0) {
        		 count=1;
        	 }
        	 else
        	 {
        	 count=0;
        	 while(temp!=0)
        	 {
        		 count++;
        		 temp=temp/10;
        		 
        	 }
        	}
        	 
        	 queue1.offer(count);
         }
         System.out.println(queue1);
	}

}
