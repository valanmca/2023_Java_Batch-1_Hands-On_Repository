package com.mahesh.ds_day6;

import java.util.LinkedList;
import java.util.Scanner;

public class Binary_Search_String {

	public static void main(String[] args) {
		LinkedList<String> lls= new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		int range=5;
		System.out.print("Enter your list elements:");
		for(int i=0;i<range;i++)
		{
			lls.add(sc.next());
		}
		System.out.print("List is : "+lls);
		int left =0;
		int right=lls.size();
		
		Scanner obj =new Scanner(System.in);
		System.out.print("\nEnter your Search element:");
		String search=obj.next();
		boolean flag=false;
		while (left <= right) {

			int mid = (left + right) / 2;
			if (lls.get(mid).compareTo(search)>0) {
				left = mid + 1;

			}

			else if (lls.get(mid).compareTo(search) < 0) {
				right = mid - 1;
			}

			else if (lls.get(mid).compareTo(search)==0) {
				System.out.print("Value found");
				flag = true;
				break;
			}

	}
		if(flag==false)
		{
			System.out.print("Value not found");
		}
	}
}
