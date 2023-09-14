package com.purushoth.day7;

import java.util.Scanner;

public class SelectionSortArrayDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of array is: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values are: ");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The values are: ");
		for (int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		for (int i=0;i<size;i++) {
			int max=i;
			for(int j=i;j<size;j++) {
				if(arr[max]<arr[j]) {
					max=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;
			
		}
		/* for(i : arr){
		 * System.out.println(i);
		 */
		System.out.println("The sorted values in descending : ");
       for (int i=0;i<size;i++) {
    	   System.out.println(arr[i]);
       }

	}

}//Selection sort in descending order.
