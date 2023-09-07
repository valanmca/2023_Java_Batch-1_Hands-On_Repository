//linear search algorithm with ArrayList
package com.domnic.day6;
import java.util.ArrayList;
import java.util.Scanner;
public class LinearSearch2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> list=new ArrayList<Character>();
		System.out.println("Enter the Total no.of Elements needed in list ");
		int total=sc.nextInt();
		System.out.println("Enter "+total+" Elements");
		for(int i=0;i<total;i++) {
			list.add(sc.next().charAt(0));
		}
//		list.add('D'); 
//		list.add('E');
//		list.add('I');
//		list.add('W');
//		list.add('O');
//		list.add('P');
//		list.add('Q');
//		
		System.out.println(list);
		System.out.println("Enter the Character to be searched :");
		char ch=sc.next().charAt(0);
		
		boolean temp=false;
		
		for(int i=0;i<list.size();i++) {
			if(ch==list.get(i)) {
				System.out.println("The Character "+ch+" is present in the index :"+i);
				temp=true;
			}
			
		}
		if(temp==false) {
			System.out.println("The Character "+ch+" is not Present int the list :");
		}

	}

}
