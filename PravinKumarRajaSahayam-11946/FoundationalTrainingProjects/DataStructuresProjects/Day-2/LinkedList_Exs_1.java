package com.pravinkumar.day2;
import java.util.LinkedList;
public class LinkedList_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<Integer>list=new LinkedList<Integer>();
    
    
    //Adding an Elements at the End
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    
    System.out.println("List:" + list);
    //[10,20,30,40]
    
    //Inserting an Element Using Index Value
    list.add(1,25);
    System.out.println("List:" + list);
    //[10,25,20,30,40]
    
    //Update the Number with thw help of the Index
    list.set(1, 100);
    System.out.println("List: " + list);
    //[10,100,20,30,40]
    
    
    //Remove the Elements with the help of the Index
    list.remove(1);
    System.out.println("List: " + list);
    //[10,20,30,40]
    
    
    
    //Print the what are all the Elements in the List
    System.out.println(list.size());
    //4
    
    //For show the Numbers in the Inputs
    for(int i=0;i<list.size();i++)
    {
    	System.out.println(list.get(i));
    }
	}

}
