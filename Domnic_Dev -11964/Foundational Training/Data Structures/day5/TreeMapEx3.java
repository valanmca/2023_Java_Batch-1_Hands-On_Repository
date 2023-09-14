//Find the count of values in the list and add it in the map
package com.domnic.day5;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Scanner;
public class TreeMapEx3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the list :");
		int size=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			int count = 0;
			int num = list.get(i);
			while (num != 0) {
				num = num / 10;
				count++;
			}
			//System.out.println(count);
			 
			map.put(list.get(i),count);
			
			
		}
		System.out.println("Size of the Elements are :"+map);

}
}
