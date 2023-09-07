package com.jenish.day01;

import java.util.Scanner;

public class Array_Sample_Ex2 {

	public static void main(String[] args) {
		float arr[]=new float[15];
		System.out.println("Initial Array Elements Are");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter"+arr.length+"Values");
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<arr.length;i++) {
			arr[i]=sc.nextFloat();
		}
		System.out.print("New Array Elements Are:"+"\t");
		for (int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+"\t");
		}
		sc.close();

	}

}
