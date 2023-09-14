package com.swetha.day2;
import java.util.ArrayList;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		
		//Multiplying the list1 elemenets with num and storing in list2
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			list1.add(i);
		}
		System.out.println(list1);
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=0;i<10;i++) {
			list2.add(list1.get(i)*num);
		}
		System.out.println(list2);
		
		
	}

}
