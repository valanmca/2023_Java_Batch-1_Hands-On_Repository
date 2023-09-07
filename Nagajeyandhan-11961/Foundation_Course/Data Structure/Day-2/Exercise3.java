//Odd and even in separate List

package com.jeyandhan.day02;
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>(); //empty list
		LinkedList<Integer> eveList = new LinkedList<Integer>();
		LinkedList<Integer> oddList = new LinkedList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt(); // size
		
		System.out.println("Enter the numbers: ");
		
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			list1.add(a); //adding values
		}
		System.out.println("The elements in the list are: "+list1); //display elements in the list
		
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)%2==0) { //condition for odd or even
				eveList.add(list1.get(i)); //add values if it is even
			}
			else {
				oddList.add(list1.get(i)); //add values if it is odd
			}
		}
		System.out.println("Even numbers in the list are: "+eveList); //Print even values in the list
		
		System.out.println("Odd numbers in the list are: "+oddList); //Print odd values in the list
	}
	

}
