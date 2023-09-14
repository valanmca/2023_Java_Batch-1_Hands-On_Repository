package com.purushoth.day6;

public class BinarySearchArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		int beg=0;
		int end=arr.length-1;
		
		int k=1;
		int count=0;
		while(beg <= end) {
			int mid=(beg+end)/2;
			if(arr[mid]==k) {
				System.out.println("Element present in the index: "+mid);
				count++;
				break;
			}
			if(arr[mid]<k) {
				beg=mid+1;
			}
			if(arr[mid]>k) {
				end=mid-1;
			}
		}
		if(count==0) {
			System.out.println("Element is not found.");
		}

	}

}//Binary search using array.
