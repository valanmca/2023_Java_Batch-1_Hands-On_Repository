package com.swetha.day6;
import java.util.LinkedList;
import java.util.Scanner;
public class BinarySearchLinList {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter searching element :");
		int key=sc.nextInt();
		
		int flag=0;
		int first=0;
		int last=list.size()-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(key==list.get(mid)) {
				flag=1;
				System.out.println("Searching element is found ");
				break;
			}
			else if(key>list.get(mid)) {
				first=mid+1;
			}
			else if(key<list.get(mid)) {
				last=mid-1;
			}
		}
		if(flag==0) {
			System.out.println("Searching element is not found");
		}
		
		
	}

}
