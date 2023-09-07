package com.mahesh.ds_day4;

import java.util.Scanner;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Queue_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List ls = new ArrayList();
		System.out.println("\nPALINDROME CHECKING\n********** ********");
		System.out.print("Enter the input do you want : ");
		int input = sc.nextInt();
		for (int index = 0; index < input; index++) {
			ls.add(sc.next());
		}
		System.out.println("INPUT OF THE LIST :" + ls);
		Stack st = new Stack();
		ArrayList new_list = new ArrayList();
		for (int index = 0; index < input; index++) {
			st.push(ls.get(index));
			new_list.add(st.pop());
		}
		System.out.println("\nREVERSE LIST : " + new_list);
		
		boolean flag = false;
		for (int index = 0; index < input; index++) {
			if ((ls.get(index)).equals(new_list.get(index))) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("\nPalindrome");
		} else {
			System.out.println("\nNot an Palindrome");
		}
	}
}
