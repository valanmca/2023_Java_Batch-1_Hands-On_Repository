package com.muthu.day4;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {	
		Queue<Integer> queue=new LinkedList<Integer>();
		Queue<Integer> Digitcount = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		System.out.println("Enter the value");
		for (int i = 0; i < n; i++) 
		{
			int temp = sc.nextInt();
			queue.offer(temp);
		}
		
		System.out.println("Initial queue : "+queue);

		for (int i = 0; i < n; i++)
		{
			int count = 0;
			int number = queue.poll();// store the value from inputlist
			while (number != 0) {
				number = number / 10;
				count++;
			}
			
			//System.out.println("count the number" + queue.poll()+ ":" + count);
			Digitcount.offer(count);
		}
		System.out.println("Output queue : "+Digitcount);
		
	}

}
