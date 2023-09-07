package com.mahesh.ds_day2;
import java.util.*;
public class linked_list {

	public static void main(String[] args) {
		
		LinkedList ls =new LinkedList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ls.add(0,11);//add the value in 0th index
		
		System.out.println(ls);
		ls.add(0,12); //add the value in 0th index
		System.out.println(ls);
		ls.set(0, 1); // assign the value(1) in 1st index
		ls.set(1, 2); // assign the value(2) in 1st index
		System.out.println(ls);
		ls.remove(4); //30 will be remove
		System.out.println(ls);
		
		
		for(int i=0;i<ls.size();i++)
			
		{
			System.out.print(" | "+ls.get(i)+" | ");
		}
	}

}
