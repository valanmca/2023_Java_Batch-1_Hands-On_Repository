//TreeMap DigitCount

package com.jeyandhan.day05;

import java.util.LinkedList;

import java.util.TreeMap;

import java.util.Scanner;

public class DigitCountTreeMap {

	public static void main(String[] args) {
		
		LinkedList<Integer> inputList = new LinkedList<Integer>();
		LinkedList<Integer> digitCountList = new LinkedList<Integer>();
		TreeMap <Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		
		System.out.println("Enter the values");
		for(int i=0;i<size;i++) {
			int temp = sc.nextInt();
			inputList.add(temp);
		}
		System.out.println("List1: "+inputList);
		
		for(int i=0;i<size;i++) {
			int temp=inputList.get(i);
			int count=0;
			int number = temp;
			while(number>0) {
				number = number / 10;
				count ++;
			}
			
			digitCountList.add(count);
		}
		System.out.println("List2:"+digitCountList);
		 
		for(int i=0;i<size;i++) {
			map.put(inputList.get(i),digitCountList.get(i));
		}
		System.out.println("Output:"+map);
	}

}
