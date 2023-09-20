package com.dharshu.assessment;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();//ArrayList declaration
		
		System.out.println("Add the elements in an array");

		//Inserting or adding the element in an arraylist
			list.add(10);
			list.add(20);
			list.add(30);
			
			System.out.println("The elements are"+list);//Displaying the Result.
			
			System.out.println("Enter the element to be searched");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			for(int i=0;i<list.size();i++) {
				if(num==list.get(i)) {
					System.out.println("Is present");
					break;
				}
				else {
					System.out.println("Is not present");
				}
			}
	}

}
