package com.swetha.day2;
import java.util.ArrayList;
public class CreateArrList {

	public static void main(String[] args) {
		
       ArrayList<Integer> list=new ArrayList<Integer>(); //Initially size is 0
       System.out.println("Size :"+ list.size());
       System.out.println(list);
       
       //Adding elements in ArrayList
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       
       //After adding elements,size and list will be
       System.out.println("After adding elements,size and list will be");
       System.out.println("Size : "+list.size());
       System.out.println(list);
       
       //Removing an element from list
       list.remove(2);
       
       System.out.println("After removing an element from the list");
       System.out.println("Size : "+list.size());
       System.out.println(list);
       
       //Insert the element at the middle
       list.add(2,100);
       
       System.out.println("After inserting an element at middle");
       System.out.println("Size : "+list.size());
       System.out.println(list);
       
       
       
	}

}
