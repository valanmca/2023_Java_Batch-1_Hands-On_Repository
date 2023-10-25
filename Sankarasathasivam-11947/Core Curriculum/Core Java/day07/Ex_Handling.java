package com.shiva.core.day07;

public class Ex_Handling {

	public static void main(String[] args) {
		
		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			System.out.println(arr[5]);
		} catch (Exception e) {
			System.out.println(e);
		}
//		System.out.println(arr[1]);
	}

}
