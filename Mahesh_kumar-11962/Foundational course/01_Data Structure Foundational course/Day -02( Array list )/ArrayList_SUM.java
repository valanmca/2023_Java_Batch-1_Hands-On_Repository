package com.mahesh.ds_day2;
import java.util.*;
public class ArrayList_SUM {

	public static void main(String[] args)
	{
	ArrayList<Integer> arrlist = new ArrayList<Integer>();
	arrlist.add(10);
	arrlist.add(20);
	arrlist.add(30);
	arrlist.add(40);

	 
	int sum =0;
	
	for(int i=0;i<arrlist.size();i++)
	{
		sum = sum+arrlist.get(i);
	}
	
	System.out.print(arrlist);
	
	

}
}
