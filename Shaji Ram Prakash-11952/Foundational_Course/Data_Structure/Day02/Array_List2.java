package com.shaji.Day02;

import java.util.ArrayList;

public class Array_List2 {

	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	// Write a Java Program using Array List and Perform the below
	// 1. Add five Elements 10, 20, 30, 40, 50 into Array List
	// 2. Find the sum of index 2 and 3 elements in the Array List
	// 3. Insert the sum value into the Array List at Index 0
	// 4. Print the Array List and verify the Result
	// 5. Replace the last element of the Array list with 100
	// 6. Print the Array List and verify the Result
	// 7. Remove the Index 0 of the Array List
	// 8. Print the Array List and verify the Result
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);

	System.out.println("Size : " + list.size()); // size : 5
	System.out.println(list); // 1.[10,20,30,40,50]
	
	int sum =list.get(2) + list.get(3);
	System.out.println("Sum is " + sum);// 2.Sum is 70
	
	list.add(0,70);
	System.out.println(list);// 3.inserted as [70,10,20,30,40,50]
	
	System.out.println(list);// 4.Result [70,10,20,30,40,50]
	
	list.set(list.size()-1,100);
	System.out.println(list);// 5.Replaced 50 to 100 [70,10,20,30,40,100]

	System.out.println(list);// 6.Result [70,10,20,30,40,100]
	
	list.remove(0);
	System.out.println(list);// 7.Removed index[0] [10,20,30,40,100]

	System.out.println(list);// 8.Result [10,20,30,40,100]

	}

}
