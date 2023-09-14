package com.dharshu.day2;

import java.util.ArrayList;

public class ArrayListPro {

	public static void main(String[] args) {
		ArrayList<Integer> lis=new ArrayList<Integer>();
		System.out.println("Size:"+lis.size());
		System.out.println(lis);//list is empty
		
		lis.add(20);//Adding the element at the end
		lis.add(28);
		lis.add(10);
		
		System.out.println("Size:"+lis.size());
		System.out.println(lis);
		
		lis.remove(2); //Removing by using the index
		
		System.out.println("Size:"+lis.size());
		System.out.println(lis);
		
		lis.add(1,55);//inserting the element in the middle with the help of index
		
		System.out.println("Size:"+lis.size());
		System.out.println(lis);
	}

}
