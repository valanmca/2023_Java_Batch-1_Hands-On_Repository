/***** Binary Search Algorithm Using LinkedList... *****/
package com.sara.day06;

import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer> ();
		
		System.out.println("Enter The List Size : ");
		Scanner sc =new Scanner (System.in);
		int size = sc.nextInt();
		System.out.println("Enter The Elements : ");
		for (int i=0;i<size;i++) {
			int element = sc.nextInt();
			list.add(element);
			
		}
		System.out.println("The Given List : "+list);
		list.sort(null);
		System.out.println("The Sorted List : "+list);
		
		System.out.println("Enter The Elements to Search : ");
		int search = sc.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			int beg=i;
			int end = size-1;
			int mid = (beg + end)/2;
			int h=list.get(i);
			while(h==search) {
				
				System.out.println("The Element is Present in the index : "+i);
			
		if ( h < search  ) {
			beg = mid +1;
			}
		else if(h >search ){
			end = mid -1;
		    }
		count++;
		break;
			}
			
		}
		
		
		if(count==0) {
			System.out.println("The element is not found.");
		}
	
	}

}
