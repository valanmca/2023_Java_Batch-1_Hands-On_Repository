package com.aravind.day7;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListBubbleSortAsc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i <size; i++) {
		 arr.add(sc.nextInt());
		}
		System.out.println(arr);
		int temp;

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(arr.get(j)>arr.get(j+1))
				{
					temp=arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1,temp);
				}
			}
		}
		System.out.println("Sorted arrayList");
		System.out.println(arr);

	}

}
