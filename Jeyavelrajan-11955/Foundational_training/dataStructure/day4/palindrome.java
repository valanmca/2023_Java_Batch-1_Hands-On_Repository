package com.jeyavel.day4;
import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class palindrome {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner (System.in);
	LinkedList<Integer> list = new LinkedList<Integer>();
	LinkedList<Integer>list1 = new LinkedList<Integer>();
	System.out.println("enter the Size of the list");
	int num= sc.nextInt();
	
	@SuppressWarnings("unused")
	Deque<Integer> dq=new LinkedList<Integer>();
	//dq.p
	
	for(int index = 0;index<num;index++) {
		int temp=sc.nextInt();
		list.add(temp);
	}
	System.out.println(list);
	
	for(int index=1;index<=num;index++) {
		list1.add(list.get(num-index));
		
	}
	
    System.out.println(list1);
    boolean result = true;
    
    for(int index=0;index<list.size();index++) {
    	if(list.get(index)== list1.get(index)) {
    		continue;
    	}else {
    		System.out.println("It is not a palindrome");
    		result=false;
    		break;
    	}
    	
    }
    if(result) {
    	System.out.println("It is a Palindrome");
    }
	}
	
	//Deque ob = new LinkedList();

	
}
