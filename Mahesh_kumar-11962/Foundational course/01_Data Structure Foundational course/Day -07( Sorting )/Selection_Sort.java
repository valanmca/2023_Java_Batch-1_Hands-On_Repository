package com.mahesh.ds_day7;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		// Selection sort
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the array size :");
		size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter your inputs : ");
		for (int index = 0; index < size; index++) {
			array[index] = sc.nextInt();
		}

		System.out.println("ARRAY ELEMENTS :\n");
		for (int index = 0; index < size; index++) {
			System.out.print(array[index] + " ");

		}
		for (int index = 0; index < size; index++) {
			int min_val = index;
			for (int Sindex = index + 1; Sindex < size; Sindex++) {
				if(array[min_val]>array[Sindex])
				{
					min_val=Sindex;
				}

			}
		int temp = array[index];
		array[index]=array[min_val];
		array[min_val]= temp;
		
		
		}
		System.out.println("\nAfter Sorting:");
		
		for(int ob:array)
		{
			System.out.print(ob+" ");
		}

	}

}
