package com.jenish.day02;
import java.util.LinkedList;
public class LinkedList_Sample_Ex1 {

	public static void main(String[] args) {
		LinkedList<Integer> list =new LinkedList<Integer>();
		
		//Adding Elements At the End
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Enter the values:" +list); //10,20,30,40
		
		list.add(1,25); //inserting element using index value
		System.out.println("Insert the value:" +list); //[10,25,30,40]
		
		list.set(1,100);//update
		System.out.println("Update the value:" +list); //[10,100,20,30,40]
		
		list.remove(1);
		System.out.println("Remove the values:" +list); //[10,20,30,40]
		
		System.out.println("Size of the List:" +list.size()); //4
		
		System.out.println("Enter the List Values:");
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
	}
		

}
}
