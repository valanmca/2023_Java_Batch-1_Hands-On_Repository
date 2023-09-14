package com.naveen.day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx06 {

	public static void main(String[] args) {
		Queue<Integer> queue01 = new LinkedList<Integer>();
		Queue<Integer> queue02 = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Queue :");
		int range = sc.nextInt();

		System.out.println("Enter The List Values :");
		for (int i = 0; i < range; i++) {
			int num = sc.nextInt();
			queue01.offer(num);
		}
		
		System.out.println("Initial Queue :" + queue01);

		for(int i=0;i<range;i++) {
	    int count = 0;
	    int element = queue01.poll();
	    while(element > 0) {
	    	element = element/10;
	    	count++;
	    }
	    queue02.offer(count);
	    //System.out.println("Total Number of digits in " + queue01.poll() + " :" + count);
		}
		System.out.println("Second Queue :" +queue02);


		sc.close();
	}

}
