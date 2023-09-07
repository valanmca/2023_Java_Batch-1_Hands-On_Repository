package com.jenish.day06;
import java.util.Scanner;
//BinarySearch Algorithm-Array
public class BinarySearch_Algorithm_Arr_Sample_Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int array[]= {11,12,13,14,15,16,17,18,19,20};
		int Find = sc.nextInt();
		int up=0;
		int dw=array.length-1;
		int mid=(up+dw)/2;
		
		boolean  isPresent=false;
		while (up<=dw) {
			if(array[mid]==Find) {
				System.out.println("Element Present in the index:" +mid);
				isPresent=true;
				break;
				
				}
			
			if (array[mid]<Find) {
				up=mid+1;
				mid=(up+dw)/2;
			}
			if(array[mid]>Find) {
				dw=mid-1;
				mid=(up+dw)/2;
			}
			
		}
		if(isPresent==false)
			System.out.println("Element not Present");
		sc.close();

	}

}

