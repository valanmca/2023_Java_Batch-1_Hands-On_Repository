package com.purushoth.day1;
import java.util.Scanner;
public class Search1 {

	public static void main(String[] args) {
		int arr[]=new int[3];
		int search=0;
		System.out.println("Enter "+arr.length+" Array values: ");
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Enter the search value: ");
		search=sc.nextInt();
		int find=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search){
				System.out.println(i);
				find=1;
			}
		}
		if(find==0) {
			System.out.println("-1");
		}
		}

	}


