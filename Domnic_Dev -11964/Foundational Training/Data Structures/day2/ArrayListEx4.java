package com.domnic.day2;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListEx4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter the Total no.of Elements needed in list ");
		int total=sc.nextInt();
		System.out.println("Enter "+total+" Elements");
		for(int i=0;i<total;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("Elements in the list are :"+list);
		ArrayList<Integer> Evenlist=new ArrayList<Integer>();
		ArrayList<Integer> oddlist=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0){
				Evenlist.add(list.get(i));
			}
			else
			{
				oddlist.add(list.get(i));
			}
			
		}
		System.out.println("Odd Elements :"+oddlist);
		System.out.println("Even Elements :"+Evenlist);
		
	}

}
