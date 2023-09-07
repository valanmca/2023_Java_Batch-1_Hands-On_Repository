package com.madhan.day02;
import java.util.*;

public class LinkedListsample {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Size:"+list.size());
		System.out.println(list);
		list.add(90);
		System.out.println(list);
		list.add(2,60);
        System.out.println(list);
		
        list.set(1, 50);
        System.out.println(list);
        
        list.remove(2);
        System.out.println(list);
        
        System.out.println("List of all elements:");
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
	}

}
