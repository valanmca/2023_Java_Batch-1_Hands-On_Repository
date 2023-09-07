package com.mahesh.ds_day4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DeQue_Sort {

	public static void main(String[] args) {
		Deque<Integer> D_obj = new LinkedList<Integer>();
		Deque<Integer> New_D_obj = new LinkedList<Integer>();
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			D_obj.offer(sc.nextInt());
		}
		System.out.println("Deque : " + D_obj);

		for (int i = 0; i < D_obj.size(); i++) {
			int count = 0;
			int value =D_obj.getFirst();
			while(value!=0)
			{
				value=value/10;
				count++;
			}
			New_D_obj.offer(count);
		}
		System.out.println("Deque Count: " + New_D_obj);

	}

}
