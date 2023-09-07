package com.shiva.day02;

//Add,sum,replace,traversal elements in ArrayList

import java.util.ArrayList;

public class ArrayListExample03 {

	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//Adding the array in a list
		System.out.println("The Size of the array :"+list.size());
		System.out.println(list);
		
		//sum of two values
		int sum = list.get(1)+list.get(2);
		System.out.println("\nAdding list 1 and 2 :"+sum);
		
		//inserting sum value into index 0
		list.add(0,sum);
		System.out.println(list);
		System.out.println("The Size of the array :"+list.size());//verifying the result
		
		//Replacing the 100 in last index
		list.set(5, 100);
		System.out.println(list);
		
		//Removing the first element
		list.remove(0);
		System.out.println(list);
		System.out.println("The Size of the array :"+list.size());
	}

}
