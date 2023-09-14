package com.muthu.day6;
import java.util.ArrayList;
import java.util.Scanner;
//Linear Search Algorithm-Array
public class ex6 {
	public static void main(String[]args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		
		list.add('C');
		list.add('D');
		list.add('A');
		list.add('E');
		list.add('F');
		list.add('B');
		list.add('X');
		System.out.println("Enter the Character to serach");
		Scanner sc=new Scanner(System.in);
		char k=sc.next().charAt(0);
		
		
		boolean isPresent =false;
		for(int i=0; i<list.size();i++){
			if(k==list.get(i)) {
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
