package com.aravind.day6;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> arr = new LinkedList<Integer>();
		for (int i = 1; i <= 10; i++) {
			arr.add(i);
		}
		System.out.println(arr);

		System.out.println("enter the search element");
		int searchelement = sc.nextInt();
		int low = 0;
		int high = arr.size() - 1;
		int mid = (low + high) / 2;
		
		boolean isPresent = false;
		while (low <= high) {

			if (arr.get(mid) == searchelement) {
				System.out.println("element present at index " + mid );
				System.out.println( arr.get(mid));
				isPresent = true;
				break;
			} else if (arr.get(mid) > searchelement) {
				high = mid - 1;
				mid = (low + high) / 2;
			}

			else  {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		
		if(isPresent==false)
		{
			System.out.println("not present");		
			}
		
		

	}

}
