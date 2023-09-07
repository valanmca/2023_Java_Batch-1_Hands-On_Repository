package com.mahesh.ds_day6;

import java.util.*;

public class Binary_Search_2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lls= new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int range=6;
		System.out.print("Enter your list elements:");
		for(int i=0;i<range;i++)
		{
			lls.add(sc.nextInt());
		}
		System.out.print("List is : "+lls);
		int left =0;
		int right=lls.size();
		
		Scanner obj =new Scanner(System.in);
		System.out.print("\nEnter your Search element:");
		int search=obj.nextInt();
		boolean flag=false;
		while (left <= right) {

			int mid = (left + right) / 2;
			if (lls.get(mid) < search) {
				left = mid + 1;

			}

			else if (lls.get(mid) > search) {
				right = mid - 1;
			}

			else if (lls.get(mid) == search) {
				System.out.print("Value found");
				flag = true;
				break;
			}
		}

}
}
