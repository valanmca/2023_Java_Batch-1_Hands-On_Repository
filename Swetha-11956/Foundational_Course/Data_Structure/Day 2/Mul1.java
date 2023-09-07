package com.swetha.day2;
import java.util.ArrayList;
import java.util.Scanner;
public class Mul1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		//Multiplying the num with each element in the list1
		
		for(int i=1;i<=10;i++) {
			list1.add(i);
		}
		System.out.println(list1);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		
		for(int i=0;i<10;i++) {
			list2.add(list1.get(i)*num);
		}
		System.out.println(list2);
		
		for(int i=0;i<10;i++) {
			
				System.out.println(list1.get(i) +" * "+ num +" = "+ list2.get(i));
			
		}
	}

}
