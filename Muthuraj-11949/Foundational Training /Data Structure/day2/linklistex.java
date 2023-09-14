package com.muthu.day2;
import java.util.Scanner;
import java.util.ArrayList;
public class linklistex {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
	    System.out.println("list");
	    
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		System.out.println("L1"+list1);
		
	
		System.out.println("Enter the number");
		int n=sc.nextInt();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for(int i=0; i<list1.size();i++) {
			int mul = list1.get(i) * n;
			list2.add(mul);
			}
		
        System.out.println(list2);
    	for(int i=0; i<list1.size();i++)
    	{
            System.out.println(list1.get (i) +"*"+n+"="+list2.get(i) );
    	}
		
		

	}

}
