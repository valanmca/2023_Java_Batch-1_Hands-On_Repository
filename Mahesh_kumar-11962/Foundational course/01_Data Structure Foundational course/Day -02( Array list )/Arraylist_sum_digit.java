package com.mahesh.ds_day2;

import java.util.*;

public class Arraylist_sum_digit {
	public static void main(String[] args) {

		ArrayList<Integer> ar_list = new ArrayList<Integer>();// we can also use LinkedList
		/*
		 * ArrayList take continuous memory then, Linked List take random memeory
		 */

		Scanner sc_ob = new Scanner(System.in);

		System.out.print("Enter your Range :");
		int size = sc_ob.nextInt();
		System.out.println("Enter " + size + " Numerical values : ");
		for (int index = 0; index < size; index++) {
			ar_list.add(sc_ob.nextInt());
		}
		System.out.print("Input ArrayList : " + ar_list);
		ArrayList<Integer> res_list = new ArrayList<Integer>();
		for (int index = 0; index < ar_list.size(); index++) {

			int val = ar_list.get(index);
			int count = 0;
			if (val > 0) {
				while (val != 0) {
					val = val / 10;
					count++;
				}
				
			} if (val == 0) {
				count++;
			}
			else {
				val = val * -1;
				while (val != 0) {
					val = val / 10;
					count++;
				}
			}
			res_list.add(count);

		}
		System.out.println();
		System.out.println("\nOuptput ArrayList :" + res_list + "\n");
		for (int index = 0; index < ar_list.size(); index++) {
			/*if (ar_list.get(index) >= 0) {*/
				System.out.println("Total no of digits : " + ar_list.get(index) + " : " + res_list.get(index));
			//} else {
				/*index++;
				//continue;
*/
			}
		}

	}

