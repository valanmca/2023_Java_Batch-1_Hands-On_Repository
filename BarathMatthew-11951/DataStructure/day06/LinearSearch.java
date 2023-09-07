package com.matthew.day06;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,3,5,2,6,7,4,8,9};
		
		System.out.println("Enter the element to search : ");
		int num = sc.nextInt();
		boolean isPresent=false; 
		for (int i=0;i<arr.length;i++) {
			if (num == arr[i]) {
				System.out.println("The Element is present in the index : "+ i);
				isPresent = true;
				break;
			}
		}
		if (!isPresent) {
			System.out.println("The element is not present in the list");
		}

	}

}
