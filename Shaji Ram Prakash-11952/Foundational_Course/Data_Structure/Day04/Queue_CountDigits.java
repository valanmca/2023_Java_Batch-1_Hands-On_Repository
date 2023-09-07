package com.shaji.Day04;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_CountDigits {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the Value : ");
		for (int i=0; i<n; i++){
			int temp = sc.nextInt();
			queue1.offer(temp);
		}
		System.out.println("Given Elements : " + queue1);
		
		for(int i=0; i<n; i++) {
			int count = 0;
			int num = queue1.poll();
			int temp = num;
			while(num!=0) {
				num = num/10;
				count++;
			}
			queue2.offer(count);
			System.out.println("Total no.of.Digits : " + temp + " is " + queue2);
		}
	}

}
