package com.domnic.day2;
import java.util.ArrayList;
public class ArrayListEx3 {
//WAJP to perform below
//	1.Add five elements 10,20,30,40,50 into AL
//	2.Find the sum of index 2 and 3 elements in AL
//	3.Insert this sum value into the ArrayList at index 0
//	4.print the array list and verify the result
//	5.Replace the last element of the array list with 100
//	6.Print the array list and verify the result
//	7.Remove the first element from the array list
//	8.Print the array list and verify the result
	public static void main(String[] args) {
	  ArrayList<Integer> list=new ArrayList<Integer>(); //1
	  list.add(10);
	  list.add(20);
	  list.add(30);
	  list.add(40);
	  list.add(50);
	  System.out.println("Elements of the list :"+list);
	  System.out.println();
	  int sum=0;                                        //2
	  sum=list.get(2)+list.get(3);
	  System.out.println("Sum of Index 2 & 3 is :"+sum);
	  System.out.println();
	  list.add(0,sum);                                 //3
	  System.out.println("Elements of the list :"+list);//4
	  System.out.println();
	  list.set(list.size()-1,100) ;                                 //5
	  System.out.println("Elements of the list :"+list);//6
	  System.out.println();
	  list.remove(0);                                   //7
	  System.out.println("Elements of the list :"+list);//8
	}

}
