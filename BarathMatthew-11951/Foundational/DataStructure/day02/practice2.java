package com.matthew.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i = 1;i<=10;i++) {
			list1.add(i);
			list2.add(i*num);
		}
		System.out.println("L1 :"+list1);
		System.out.println("L2:"+list2);
	}

}
