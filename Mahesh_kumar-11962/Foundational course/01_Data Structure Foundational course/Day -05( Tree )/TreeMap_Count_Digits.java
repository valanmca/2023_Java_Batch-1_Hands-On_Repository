package com.mahesh.ds_day5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap_Count_Digits {

	public static void main(String[] args) {
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		Scanner sc_ob = new Scanner(System.in);
		System.out.println("Enter your range :");
		int range = sc_ob.nextInt();
		System.out.println("Enter your values oneby one :");
		for (int index = 0; index < range; index++) {
			arr_list.add(sc_ob.nextInt());
		}

		/*
		 Enter your range : 5
		 Enter your values oneby one : 5464 , 5464 , 454644 , 45 , 788
		 */
		
		System.out.println("ArrayList values : " + arr_list);
		// ArrayList values : [5464, 5464, 454644, 45, 788]
		ArrayList<Integer> count_array = new ArrayList<Integer>();
		for (int index = 0; index < arr_list.size(); index++) {
			int num = arr_list.get(index);
			int count = 0;
			while (num > 0) {
				num = num / 10;
				count++;
			}
			count_array.add(count);
		}

		System.out.println("Counted ArrayList values : " + count_array);
		//Counted ArrayList values : [4, 4, 6, 2, 3]
		TreeMap<Integer, Integer> T_map = new TreeMap<Integer, Integer>();
		for (int index = 0; index < arr_list.size(); index++) {
			T_map.put(arr_list.get(index), count_array.get(index));
		}

		// Result: {45=2, 788=3, 5464=4, 454644=6}
		// in this problem user gives 5 inputs then, output is 4 elements
		// bcz, TreeMap didn't allow duplicate key values.
		System.out.println("\nResult:\n  " + T_map);

	}

}
