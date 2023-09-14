package com.swetha.day4;
import java.util.Scanner;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
public class QueueDigitCount {

	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<Integer>();
		Queue<Integer>digit=new LinkedList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range of numbers : ");
		int num=sc.nextInt();
		
		System.out.println("Enter "+ num + " numbers :");
		for(int i=0;i<num;i++) {
			int n=sc.nextInt();
			queue.offer(n);
		}
		System.out.println("The queue elemnets are : "+queue);
		
		for(int i=0;i<num;i++) {
			int count=0;
			int val=queue.poll();
			while(val!=0) {
				val=val/10;
				count++;
			}
			digit.offer(count);
		}
		System.out.println("The counted digits are : "+digit);
		
		
		

	}

}
