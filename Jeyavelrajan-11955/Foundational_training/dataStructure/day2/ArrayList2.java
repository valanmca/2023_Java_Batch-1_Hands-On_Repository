package com.jeyavel.day2;
import java.util.ArrayList;

		
public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> scan = new ArrayList<Integer>();
		scan.add(10);
		scan.add(20);
		scan.add(30);
		scan.add(40);
		scan.add(50);
		System.out.println("The list of Arrays"+scan);
		
		int sum = 0;
		System.out.println("sum");
		for(int i=0;i<scan.size();i++) {
			sum+=scan.get(i);
		}
		System.out.println("Sum of the index 2 and 3 array list "+(scan.get(2)+scan.get(3)));
		scan.set(0,sum);
		
		
		scan.set(0,50);
		System.out.println("The Zero index value is " + scan.get(0));
		System.out.println(" The array list " + scan);
		
		scan.set(4,100);
		System.out.println("The 4th index value is " + scan.get(4));
		System.out.println(" The array list " + scan);
		
		scan.remove(0);
		System.out.println("The 0th index value is " + scan.get(0));
		System.out.println(" The array list " + scan);
		
		
		
		
			
		}

	}

