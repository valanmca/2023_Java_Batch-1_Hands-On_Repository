//linear searching 

package com.jenish.day01;
import java.util.Scanner;
public class Array_SamplePratice_Ex3 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		
		System.out.println("Enter the array elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Array Elements Are");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			
		}
		System.out.println("Enter element to search:");
		int num=sc.nextInt();
		boolean flag=false;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println("Index number is:" +i);
				flag=true;
				
			}
		}
		if(flag==false) {
			System.out.println("-1");
			
		}
		sc.close();
}
}