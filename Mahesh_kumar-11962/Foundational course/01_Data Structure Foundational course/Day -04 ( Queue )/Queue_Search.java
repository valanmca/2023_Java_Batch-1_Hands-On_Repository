package com.mahesh.ds_day4;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Search {

	public static void main(String[] args) {

		Queue<Integer> q_object = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			q_object.offer(sc.nextInt());
		}
		boolean flag = false;
		System.out.println("Queue Result is :" + q_object);
		System.out.println("Enter your search element : ");
		int search =sc.nextInt();
		while(!q_object.isEmpty())
		{
			
			if(q_object.poll() == search) {
				flag = true;
			}

		}
		System.out.print("Output:");
		if (flag == true) {
			System.out.print("Elementis found");
		} else {
			System.out.print("Elementis not found");
		}
	}

}
