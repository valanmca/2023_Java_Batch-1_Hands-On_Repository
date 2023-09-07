package com.purushoth.day4;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;


public class QueuePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1=new LinkedList<Integer>();
		LinkedList<Integer> list2=new LinkedList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int a=sc.nextInt();
		System.out.println("The list elements are: ");
	    for (int i=0;i<a;i++) {
	       list1.add(sc.nextInt());
	    }
	    System.out.println("The list1 is: "+list1);
	    for (int i=1;i<=a;i++) {
	    	list2.add(list1.get(a-i));
	    }
	    System.out.println("The reverse list is: "+list2);
	    int count = 0;
	    
	    for(int i=0;i<a;i++) {
	        if(list1.get(i)==list2.get(i)) {
	        		        	count++;
	    		    }
	        else {
	        	System.out.println("It is not a palindrome");
	        	count=0;
	        	break;
	        }
	    }
	    if(count!=0) {
	    	System.out.println("It is palindrome");
	    }
	    }
	}//Palindrome or not.


