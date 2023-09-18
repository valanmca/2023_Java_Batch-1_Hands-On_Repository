package com.pravinkumar.day2;

import java.util.ArrayList;

public class Array_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Summing the Number with the help of Index
		// 150
		int sum = 0;
		int arr[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			list.add(arr[i]);
		}

		list.add(0, sum);

		System.out.println("The List is:" + list);
//[150,10,20,30,40,50,]
		list.set(list.size() - 1, 100);
		System.out.println(list);

//[150,10,20,30,40,50,100]
		list.remove(0);
		System.out.println(list);
//[10,20,30,40,100]

	}

}
