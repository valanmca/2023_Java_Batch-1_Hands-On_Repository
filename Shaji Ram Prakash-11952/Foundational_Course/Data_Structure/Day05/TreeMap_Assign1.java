package com.shaji.Day05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap_Assign1 {

	public static void main(String[] args) {
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

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
			
			for(int j=0; j<n; j++) {
				map.put(temp,count);
			}	
	}
		
		System.out.println(map);
}
}
