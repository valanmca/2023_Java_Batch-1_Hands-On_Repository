package com.muthu.day6;
import java.util.LinkedList;
import java.util.Scanner;
//Linear Search Algorithm-Array
public class ex2 {
	public static void main(String[]args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		
		list.add("JAVA");
		list.add("C");
		list.add("C++");
		list.add("PYTHON");
		System.out.println("Enter the string to serach");
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		
		
		boolean isPresent =false;
		for(int i=0; i<list.size();i++){
			if(k.equals(list.get(i))) {
				System.out.println("Element present in the index:"+i);
				isPresent = true;
				break;
				
				
			}
			
		}
		if(isPresent == false) {
			System.out.println(" Element not present");
		}
		
	}

}


