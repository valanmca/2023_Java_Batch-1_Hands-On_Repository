package com.purushoth.day2;
import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		System.out.println("Size:"+list.size());
		System.out.println(list);
		
		list.add(10);// To add element
		System.out.println("Size:"+list.size());//To list size
		
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println("Size: "+list.size());
		System.out.println(list);//To show or list the values 
		
		list.remove(2);
		
		System.out.println(list);
		
		list.add(1,55);//To insert in the middle
		
		System.out.println("Size: "+list.size());
		System.out.println(list);
		
		list.set(1, 18);
		System.out.println(list);//To Update(delete,insert)
		
		System.out.println(list.get(1));
		
		System.out.println("Array List Elements are: ");//To traverse(show one by one)
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}