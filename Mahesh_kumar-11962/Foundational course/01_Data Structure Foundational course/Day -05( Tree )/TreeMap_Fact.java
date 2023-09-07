package com.mahesh.ds_day5;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMap_Fact {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> Tree_Map = new TreeMap<Integer,Integer>();
		Scanner sc_ob = new Scanner(System.in);
		System.out.println("Enter the input(Integer only) :");
		int value = sc_ob.nextInt();
		
			int fact=1;
			for(int index =1;index<=value;index++)
			{
				fact = fact*index;
				Tree_Map.put(index,fact);
			}
			
			System.out.print(Tree_Map);
			System.out.println("\nFactorial value of "+value+" is : "+Tree_Map.get(value));
		
		
		

	}

}
