package com.domnic.day2;
import java.util.ArrayList;
public class ArrayListEx2 {

	public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
     list.add(10);
     list.add(35);
     list.add(54);
     list.add(33);
     System.out.println("Size of ArrayList :"+list.size());
     System.out.println("Elements of Array List "+list);
     System.out.println();
     list.set(2, null);
     list.set(3, 99);
     System.out.println("Size of ArrayList :"+list.size());
     System.out.println("Elements of Array List "+list);
     System.out.println();
     for(int i=0;i<list.size();i++) {
     System.out.println("Elements in the ArrayList are :"+list.get(i));}
     
   
	}
	
	

}
