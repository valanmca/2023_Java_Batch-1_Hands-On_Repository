package com.dharshu.day2;

import java.util.ArrayList;

public class arrayListPro2 {

	public static void main(String[] args) {
		ArrayList<Integer> lis=new ArrayList<Integer>();
		
		lis.add(10);
		lis.add(20);
		lis.add(80);
		lis.add(60);
		
		System.out.println("Size:"+lis.size());
		System.out.println("The list element:"+lis);
		
		//update or replace
		lis.set(1, 25);//updating the element with the help of index
		System.out.println("After Updation:"+lis);
		
		System.out.println(lis.get(1));//display the element in the 1 index----25
		
		System.out.println("Array List elements are:");
		for( int i=0;i<lis.size();i++)//traversing
		{
			System.out.println(lis.get(i));//get(i)display all the element present in the arraylist
		}
	}

}
