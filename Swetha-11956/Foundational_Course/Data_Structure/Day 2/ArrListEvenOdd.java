package com.swetha.day2;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrListEvenOdd {
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 elements : ");
		for(int i=0;i<10;i++) {
		   // int n=sc.nextInt();
		    list1.add(sc.nextInt());
		}
		System.out.println("The list elements are :"+list1);
		
		for(int i=0;i<list1.size();i++) {
			if((list1.get(i))%2==0) {
			  even.add(list1.get(i));
		}
			else
				odd.add(list1.get(i));
		
	}
		System.out.println("Even numbers are " +even);
		System.out.println("Odd numbers are " +odd);
		
		
	

}
}
