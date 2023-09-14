package com.madhan.day04;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class dequeAssignment {

	public static void main(String[] args) {
		Deque<Integer> queue=new LinkedList<Integer>();
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		for(int i=0;i<value;i++)
		{
			int number=sc.nextInt();
			queue.offer(number);
		}
         System.out.println(queue);
         int search=sc.nextInt();
         int temp=0;
         while(!queue.isEmpty())
         {
        	 temp=0;
        	 int x=queue.poll();
        	 if(search==x)
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
        	 System.out.println("yes");
         }
         else
         {
        	 System.out.println("No");
         }
	}

}
