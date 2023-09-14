package com.mahesh.ds_day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_Character {
	
	public void linear_search()
	{
		ArrayList<Character>  arr_list =new ArrayList<Character>();
	    char search;
		boolean flag = false;
		Scanner ob = new Scanner(System.in);
		
		System.out.println("\nEnter yourinput range :");
		int range=ob.nextInt();
		System.out.println("Enter "+range+" Charactor :");
		
		for(int index =0;index<range;index++)
		{
			arr_list.add(ob.next().charAt(0));
		}
		System.out.print("Result : "+arr_list);
	char input;
	do
	{
		
	
		System.out.println("\nEnter your search element : ");
		search = ob.next().charAt(0);
		for(int index =0;index<arr_list.size();index++)
		{
			if(search==arr_list.get(index))
			{
				flag = true;
				//System.out.print("element is found");
			}
			else
			{
				flag = false;
			//	System.out.print("element is found");
			}
			//(flag)==true?System.out.print("element is found");:System.out.print("element is found");
		}
		if(flag == true)
		{
			System.out.println("element is found");
		}
		else
		{
			System.out.println("element is not found");
		}
		System.out.print("Do you want continue (press 1 to continue) : \n");
		input=ob.next().charAt(0);
	}while(input=='1');
	}
	
	

	public static void main(String[] args) 
	{
	System.out.print("Linear Searching\n****** *********");
	Search_Character cl=new Search_Character();
	cl.linear_search();
	System.out.println("-----*-----");
	
	}
	}


