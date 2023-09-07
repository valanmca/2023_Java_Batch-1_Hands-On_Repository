//Binary search using Linked list

package com.jeyandhan.day06;

import java.util.LinkedList;

import java.util.Scanner;

public class BinarySearchLL {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the elements: ");
		for(int i=0;i<size;i++) {
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println("The List is: " +list);
		list.sort(null);
		System.out.println("The List is: " +list);
		System.out.println("Enter the element to search: ");
		int k = sc.nextInt();
		int end =list.size()-1;
		int beg=0;
		int count = 0;
		while(beg<=end) {
			int mid=(beg+end)/2;
			if(list.get(mid)==k) {
				System.out.println("The Element is present at ");
				count++;
				break;
			}
			if(list.get(mid)<k){
				beg = mid + 1;
				mid = (beg+end)/2;
					
			}
			if(list.get(mid)> k) {
				end = mid - 1 ;
				mid = (beg+end)/2;
				
			}
		}
			if(count==0) {
				System.out.println("Not Present");
			}

	}

}
