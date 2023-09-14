package com.purushoth.day4;
import java.util.Queue;
import java.util.LinkedList;

import java.util.Scanner;

public class QueueSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements to add: ");
        int temp=sc.nextInt();
        System.out.println("The elements are: ");
                for (int i=0;i<temp;i++) {
        	 queue.offer(sc.nextInt());
        }
		int size=0;
		System.out.println("The Queue is: " + queue);
		while(! queue.isEmpty()) {
			queue.poll();
			size++;
		}
		System.out.println("The size is: "+size);
		}

	}//Find the Queue size without using size().

