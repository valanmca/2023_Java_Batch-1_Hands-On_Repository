package com.mahesh.ds_day2;
import java.util.*;
public class Array_List_Method_02 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		System.out.println("Show the First index : "+l.get(0));
		System.out.println("Show the last index : "+l.get(l.size()-1));
		
		for(int i=0;i<l.size();i++)
		{
		System.out.print(" | "+l.get(i)+" | ");
		}
		
		
		l.set(1, 2);
		l.set(2, 3);
		l.set(3, 4);
		l.set(4, 5);
		l.set(0, 1);
		
		System.out.println("\nAfter Updation (Using Set()) : ");
		
		for(int i=0;i<l.size();i++)
		{
		System.out.print(" | "+l.get(i)+" | ");
		}
		
		

	}

}
