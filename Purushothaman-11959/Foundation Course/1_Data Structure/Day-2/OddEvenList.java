package com.purushoth.day2;
import java.util.Scanner;
import java.util.LinkedList;

public class OddEvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list =new LinkedList<Integer>();
		LinkedList<Integer> Evenlist =new LinkedList<Integer>();
		LinkedList<Integer> Oddlist =new LinkedList<Integer>();


		Scanner sc=new Scanner(System.in);
		System.out.println("The number of array: ");
		int num=sc.nextInt();
		System.out.println("Enter the array value: ");
		for (int i=0;i<num;i++) {
		 list.add(sc.nextInt());
		
		}
		System.out.println("The values are:"+list);
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0) 
			{
				Evenlist.add(list.get(i));
			}
			else 
			{
				Oddlist.add(list.get(i));
			}		
		}
		System.out.println("The even list is: "+Evenlist);
		System.out.println("The odd list is:"+Oddlist);
	}

}//To find odd and even and make separate list. 
