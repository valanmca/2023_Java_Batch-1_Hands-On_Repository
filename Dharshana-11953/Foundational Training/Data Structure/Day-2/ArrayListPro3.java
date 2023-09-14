package com.dharshu.day2;

import java.util.ArrayList;

public class ArrayListPro3 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//Adding the element in an array list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("The array elements are-----:"+list);
		
		//sum of index 2 & 3
		int sum=0;
		for(int i=2;i<=3;i++) {
			
			sum=sum+list.get(i);
		}

		System.out.println("sum of the elements:-------");
		System.out.println(sum);
		
		//inserting the sum value in an arraylist in index 0
		list.add(0,70);
		System.out.println("After insertin the sum value----:"+list);
		
		//replace the last element in array with 100
		list.set(5,100);
		System.out.println("After replacing the last element:-------"+list);
		
		//remove the first element in an array list
		list.remove(0);
		System.out.println("After removing the first element in an arraylist:------"+list);
	}

}
