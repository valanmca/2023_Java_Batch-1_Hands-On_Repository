package com.mahesh.ds_day2;
import java.util.ArrayList;
public class Array_List {

	public static void main(String[] args) {
	
		ArrayList<String> arr_list =new ArrayList<String>();
		
		System.out.println("Arraylist Zero/Not : "+arr_list.size());     //size() returns integer value
		
		arr_list.add("VALUE0[index_1]"); //add(value);
		arr_list.add(0,"VALUE1[index_0]");//add(index,value);
		arr_list.add("VALUE2[index_2]");
		
		System.out.println("Arraylist values : "+arr_list); //print the Arraylist values
		System.out.println("Arraylist Size : "+arr_list.size());     //size() returns integer value
		System.out.println("Arraylist Zero/Not : "+arr_list.isEmpty()); //isEmpty() returns boolean value like true or false
	
		arr_list.remove(0);
		System.out.println("Arraylist values : "+arr_list); 
		System.out.println("Arraylist Size : "+arr_list.size());   
		
		
		
	
	
	}

}
