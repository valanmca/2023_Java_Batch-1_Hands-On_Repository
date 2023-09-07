//Searching elements in array

package com.jeyandhan.day01;
import java.util.*;
public class ArrayTest {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int a,flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("The elements:"+ arr[i]);
		}
		System.out.println("Enter the elements to be searched:");
		a=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {

				System.out.println(i);
				flag=1;
				break;
			}
			}
		if(flag!=1);
		System.out.println("-1");
		}
	}

