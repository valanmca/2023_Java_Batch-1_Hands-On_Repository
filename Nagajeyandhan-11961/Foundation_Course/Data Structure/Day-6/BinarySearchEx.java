//Binary search

package com.jeyandhan.day06;

import java.util.Scanner;

import java.util.LinkedList;

public class BinarySearchEx {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int end =arr.length-1;
		int beg=0;
		
		int k =14;
		int count = 0;
		while(beg<=end) {
			int mid=(beg+end)/2;
			if(arr[mid]==k) {
				System.out.println("Element is present");
				count++;
				break;
			}
			if(arr[mid]<k){
				beg = mid + 1;
				mid = (beg+end)/2;
					
			}
			if(arr[mid] > k) {
				end = mid - 1 ;
				mid = (beg+end)/2;
				
			}
		}
			if(count==0) {
				System.out.println("Not Present");
			}
		}
		
		
	
	}
	
	
