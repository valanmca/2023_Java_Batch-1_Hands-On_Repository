package com.purushoth.day2;
import java.util.ArrayList;

public class Array_List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		System.out.println("The elements are: "+list);
		int sum=list.get(2)+list.get(3);
		System.out.println("Sum is: "+sum);
		
		list.add(0,sum);//To add the sum
		System.out.println("The inserted is: "+list);
		
		list.set(list.size()-1, 100);//To replace at last element
		System.out.println("The Replaced is: "+list);
		
		list.remove(0);//To remove
		System.out.println("The Removed is: "+list);
		

		
		
	}

}
