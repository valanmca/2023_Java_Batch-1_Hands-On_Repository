package com.mahesh.ds_day7;
import java.util.LinkedList;
import java.util.Scanner;
public class Bubble_Sort_LL {

	public static void main(String[] args) {
		// String sorting Using Linked List ( BUBBLE SORT )
		
		LinkedList<String> lls = new LinkedList<String>();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the array size :");
		size = sc.nextInt();
		// array[] = new int[size];
		System.out.println("Enter your (String) inputs : ");
		for(int index=0;index<size;index++)
		{
			lls.add(sc.next());
		}
		
		System.out.println("ARRAY ELEMENTS :\n"+lls);
		String temp;
		
		for(int index=0;index<size-1;index++)
		{
			for(int Sindex =index+1;Sindex<size;Sindex++)
			{
				String f_val =lls.get(index);
				String s_val =lls.get(Sindex);
				if(f_val.compareTo(s_val)>0)
				{
					
					temp =f_val;
					lls.set(index, s_val);
					lls.set(Sindex,temp);
				}
			}
			
			
		}
		System.out.println("\nAFTER SORTING : \n" +lls);
		
		

	}

}
