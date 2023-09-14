package com.mahesh.ds_day2;
import java.util.*;
public class ARRAYLIST_INPUT {

		public static void main(String[] args) 
		{
			
			ArrayList<Integer> list_obj_01 = new ArrayList<Integer>();
			for(int index=1;index<=10;index++)
			{
			list_obj_01.add(index);
			}
			System.out.print("ARRAYLIST 1 :"+list_obj_01);
			ArrayList<Integer> list_obj_02= new ArrayList<Integer>();
			int digit;
			Scanner ob =new Scanner(System.in);
			System.out.println("\nEnter the digit :");
			digit = ob.nextInt();
			for(int index=0;index<10;index++)
			{
			list_obj_02.add(list_obj_01.get(index)*digit);
			}
			System.out.println("output:"+list_obj_02);
		}
	}

