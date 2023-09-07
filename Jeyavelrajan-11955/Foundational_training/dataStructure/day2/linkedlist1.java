package com.jeyavel.day2;
import java.util.LinkedList;
public class linkedlist1 {
	public static void main(String []args) {
	LinkedList<Integer> list= new LinkedList<Integer>();
	
	//Adding elements in the end 
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
    System.out.println(list);//[10,20,30,40]

    list.add(1,50);//Inserting Element using index value
    System.out.println(list);//
    
    list.set(1, 100);//update
    System.out.println(list);
    
    list.remove(1);//remove
    System.out.println(list);
    
    System.out.println(list.size());//4
    
    System.out.println("the index values are ");//append and print the list vslues 
    for(int i=0;i<list.size();i++) {
    	System.out.println(list.get(i));
    	
    }
    System.out.println("the first index element is ");
	System.out.println(list.get(1));
    
  }
}
