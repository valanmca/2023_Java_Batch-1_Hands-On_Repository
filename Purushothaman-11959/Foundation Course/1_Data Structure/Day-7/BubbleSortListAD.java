package com.purushoth.day7;
import java.util.LinkedList;
import java.util.Scanner;
public class BubbleSortListAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The size of the list: ");
		int size=sc.nextInt();
		System.out.println("Enter the list values: ");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println("The list is: "+list);
		
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				int k=list.get(i);
				int l=list.get(j);
				if(k>l) {
					temp=l;
					list.set(j,k);
					list.set(i,temp);
					
				}
			}
		}
		System.out.println("Sorted values in ascending order: "+list);

	}

}//Bubble sort in Linked list in ascending order.
