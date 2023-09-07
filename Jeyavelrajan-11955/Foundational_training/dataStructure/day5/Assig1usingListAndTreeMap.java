package com.jeyavel.day5;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Scanner;
public class Assig1usingListAndTreeMap {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of the list");
		int lrange = sc.nextInt();//get the size of the list
		System.out.println("Enter the Elements");
		for(int i=1;i<=lrange;i++) {//
			list.add(sc.nextInt());
			
		}
		System.out.println("The values of list is:"+list);
		for(int i=0;i<list.size();i++) {
			int value = list.get(i);
			int count=0;//temperory variable count using to increnment or append the element one by one
			while(value!=0) {
				count++;
				value/=10;
			}
			map.put(list.get(i), count);
		}
		System.out.println(map);

	}

}
