package com.jenish.day02;
import java.util.LinkedList;
import java.util.Scanner;
public class Lab_Sample_Task2 {

	public static void main(String[] args) {
		
			LinkedList<Integer> list =new LinkedList<Integer>();
			
			for(int i=1;i<10;i++)
			{
				list.add(i);
			}
			/*list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			list.add(10);*/
			System.out.println("Enter the Elements:" +list);
			
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the n value:");
			n=sc.nextInt();
			LinkedList<Integer> list2 =new LinkedList<Integer>();
			for(int i=0;i<9;i++) 
			{
				list2.add(list.get(i) *n);

		    }
			System.out.println("Results:" +list2);
			for(int i=0; i<list.size();i++)
			{
				System.out.println(list.get(i)+ "*" +n +"=" +list2);
			}
			sc.close();
	
	
}
}
