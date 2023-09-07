package com.purushoth.day7;
import java.util.Scanner;
import java.util.LinkedList;

public class SelectionSortListAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of the list: ");
		int size=sc.nextInt();
		System.out.println("Enter the values of list: ");
		for (int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The list:"+list);
		for(int i=0;i<size;i++) {
			int min=i;
			for(int j=i+1;j<size;j++) {
				if(list.get(min)>list.get(j)) {
					min=j;
				}
			}
			int k=list.get(min);
			int temp=list.get(i);
			list.set(i,k);
			list.set(min,temp);
		}
		System.out.println("The sorted values are: "+list);
	  	}
	    
	  


}//Selection sort using linked list in ascending order.

