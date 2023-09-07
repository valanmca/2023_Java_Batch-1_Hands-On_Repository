package com.matthew.day02;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ArrayList
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		//inserting values into list1
		for(int i = 1;i<=10;i++) {
			list1.add(i);
		}
		System.out.println("L1 :"+list1);
		//getting a number as input
		System.out.println("Enter a number");
		int num = sc.nextInt();
		//multiplying num with list1 and store it in list2
		for(int i = 0;i<list1.size();i++) {
			list2.add(list1.get(i)*num);
		}
		System.out.println("L2:"+list2);
	}

}
