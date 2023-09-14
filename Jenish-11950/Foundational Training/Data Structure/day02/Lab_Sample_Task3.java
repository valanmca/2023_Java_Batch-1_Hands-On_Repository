package com.jenish.day02;
import java.util.LinkedList;
import java.util.Scanner;
public class Lab_Sample_Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> list =new LinkedList<Integer>();
		System.out.println("Enter the Value of Size:");
		int size=sc.nextInt();
		System.out.println("Enter list 1 value:");
		for(int i=0;i<size;i++) {
			int index=sc.nextInt();
			list.add(index);
		}
		System.out.println(list);
		LinkedList<Integer> even =new LinkedList<Integer>();
		LinkedList<Integer> odd =new LinkedList<Integer>();
		for(int i=0;i<size;i++){
			if(list.get(i)%2==0)
			{
				even.add(list.get(i));
				
			}
			else
			{
				odd.add(list.get(i));
			}
		}
		
			System.out.println("Even list:" +even);
			System.out.println("Odd list:" +odd);
			sc.close();
}
}

