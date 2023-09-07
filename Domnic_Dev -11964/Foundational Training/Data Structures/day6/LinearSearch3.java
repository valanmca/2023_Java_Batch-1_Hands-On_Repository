//linear search algorithm with ArrayList
package com.domnic.day6;
import java.util.LinkedList;
import java.util.Scanner;
public class LinearSearch3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("Enter the size of the list :");
		int size=sc.nextInt();
		System.out.println("Enter the "+size+" string elements :");
		for(int i=0;i<size;i++) {
			list.add(sc.next());
		}
		System.out.println(list);
		
		System.out.println("Enter the String to be searched :");
		String word=sc.next();
		
		boolean temp=false;
		for(int i=0;i<list.size();i++) {
			if(word.equals(list.get(i))) {
				System.out.println("The string is present in index :"+i);
			}
		}
		
		if(temp==false) {
			System.out.println("The Character "+word+" is not Present int the list :");
	}

}}
