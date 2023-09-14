package com.aravind.day4;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueAss2 {

	public static void main(String[] args) {
		
     Queue <String>queue=new LinkedList<String>();
     Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
     int size=sc.nextInt();
     System.out.println("enter the value of queue");
     
     for(int i=0;i<size;i++)
     {
    	 String str=sc.next();
    	 queue.offer(str);
     }
     System.out.println("enter the value to serach=");
       String n=sc.next();
       int temp=0;
      
       while(!queue.isEmpty())
       {
    	   temp=0;
    	   String queueval=queue.poll();
    	   if(n.equals(queueval)) //compare two string use equals method
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
    	 System.out.println("value is found")  ;
       }
       else
       {
    	   System.out.println("value is not found");
       }
       
   
     
	}

}
