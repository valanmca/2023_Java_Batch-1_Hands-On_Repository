package com.shiva.day02;

import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		System.out.println("Size : "+list.size());//0
		System.out.println(list);
		
		list.add(10);//Adding Element at the end
		System.out.println("Size : "+list.size());//1
		
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("Size : "+list.size());//4
		System.out.println(list);
		
		list.remove(2); //Removing By using Index
		
		System.out.println("Size : "+list.size());//3
		System.out.println(list);// [10,20,40]
		
		list.add(1,77);//inserting in the middle of the index
		
		System.out.println("Size : "+list.size());//4
		System.out.println(list);// [10,77,20,40]
		
		list.remove(1);//77
		System.out.println(list);// [10,20,40]
	}

}
