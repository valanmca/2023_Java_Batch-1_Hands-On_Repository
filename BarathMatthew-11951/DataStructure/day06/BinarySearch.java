package com.matthew.day06;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,12,24,29,39,40,51,56,69};
		System.out.println("Enter the number to search in the array : ");
		int num = sc.nextInt();
		int end = arr.length-1;
		int work = end/2;
		int temp = 0;
		boolean isPresent = false;
		while (work !=-1) {
			if (arr[work] == num) {
				System.out.println("Present in the index :"+work);
				isPresent = true;
				break;
			}
			if(arr[work] < num) {
				temp = work+1;
				work = (temp+end)/2;
				}
			if(arr[work] > num){
				end = work -1;
				work = (temp+end)/2;
			}
			
			}
		if (!isPresent) {
			System.out.println("Not present");
		}
			
				
		}


}
