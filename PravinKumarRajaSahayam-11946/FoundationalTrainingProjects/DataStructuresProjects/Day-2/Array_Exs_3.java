//ArrayList Programs for ADD,REMOVE,Print(List,Size)
package com.pravinkumar.day2;
//For import in ArrayList We used this
import java.util.ArrayList;

public class Array_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList Syntax Used
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		//Without Declare any Sizes in list
		System.out.println("Size: " + list.size());
		
		//Without Declare the list in initial
		System.out.println("List: " + list);
		
		//Adding an Element at the end of the List
		list.add(10);
		System.out.println("Size: " + list.size());
		System.out.println("List: " + list);
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Size: " + list.size());//5
		System.out.println("List: " + list);//[10,20,30,40,50]
		
		//Removing an Element using the Index in the List
		list.remove(3);
		System.out.println("Size: " + list.size());//3
		System.out.println("List: " + list);//[10,20,30,50]
		
		list.add(1,55);//Inserting an Element in the middle in the list with the help of Index
		
		System.out.println("Size: " + list.size());//4
		System.out.println("List: " + list);//[10,20,30,40,50,55]
		
		//Remove the Element in the List with the help of the Index
		list.remove(1);
		System.out.println("Size: " + list.size());//3
		System.out.println("List: " + list);//[10,20,30]

	}

}
