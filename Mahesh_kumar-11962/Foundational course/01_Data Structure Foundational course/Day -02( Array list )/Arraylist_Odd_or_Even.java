package com.mahesh.ds_day2;
import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist_Odd_or_Even {

	public static void main(String[] args) {
		int input;
		Scanner ob =new Scanner(System.in);
		System.out.print("Enter a value : ");
		input = ob.nextInt();
		
		System.out.println("Enter the values one by one :");
		ArrayList<Integer> list_01 = new ArrayList<Integer>();
		ArrayList<Integer> Even_list = new ArrayList<Integer>();
		ArrayList<Integer> Odd_list = new ArrayList<Integer>();
		for(int index=0;index<input;index++)
		{
		list_01.add(ob.nextInt());
		}
		
		System.out.print(" \n"+list_01);
	
		for(int index=0;index<list_01.size();index++)
		{
		  if(list_01.get(index)%2==0)
		  {
			  Even_list.add(list_01.get(index));
			  
		  }
		  else
		  {
			  Odd_list.add(list_01.get(index));
		  }
		}

		System.out.println("\nEVEN ARRAYLIST : "+Even_list);
		System.out.println("ODD ARRAYLIST : "+Odd_list);


}
}
