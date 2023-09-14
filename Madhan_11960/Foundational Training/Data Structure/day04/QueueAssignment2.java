package com.madhan.day04;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class QueueAssignment2 {

	public static void main(String[] args) {
		Queue<Integer> queue =new LinkedList<Integer>();
		System.out.println("Enter the size:");
		Scanner size=new Scanner(System.in);
	    int s=size.nextInt();
	    System.out.println("Enter the values:");
		for(int i=0;i<s;i++)
		{
			int n=size.nextInt();
			queue.offer(n);
		}
		System.out.println(queue);
		System.out.println("Enter the element to be search:");
		int value=size.nextInt();
		   int temp=0;
		while(!queue.isEmpty())
		{
			temp=0;
			int x=queue.poll();
			if(value==x)
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
    	 System.out.println("yes, It is present");
     }
     else
     {
    	 System.out.println("No, It is not present");
     }
	}

}
