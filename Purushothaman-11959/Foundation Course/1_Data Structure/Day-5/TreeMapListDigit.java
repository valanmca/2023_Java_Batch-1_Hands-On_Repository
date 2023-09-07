package com.purushoth.day5;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapListDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		LinkedList<Integer> list1=new LinkedList<Integer>();
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("The no.of elements is: ");
		int a=sc.nextInt();
		System.out.println("The elements are: ");
		for(int i=0;i<a;i++) {
			int temp=sc.nextInt();
		    list.offer(temp);
		}
		System.out.println("The queue is: "+list);	
		for (int i=0;i<a;i++) {
			int count=0;
			int num=list.poll();
			int temp=num;
		while(num!=0) {
		    num/=10;
		    count++;
		}
	list1.offer(count);
	System.out.println("The total number of digits " +temp+ " : "+list1);
	
	for(int j=0;j<a;j++) {
		map.put(temp,count);
	}
	
	}
		System.out.println(map);

	}
}//To list the count of digits in treemap.
