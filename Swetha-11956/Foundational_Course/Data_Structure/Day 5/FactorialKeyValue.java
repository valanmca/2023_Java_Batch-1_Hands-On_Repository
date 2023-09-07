package com.swetha.day5;
import java.util.TreeMap;
public class FactorialKeyValue {

	public static void main(String[] args) {
		
		//Finding the factorial from 1 to 10.....;1 to 10 is key and its factorial is value,stored in treeMap.
		
		TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
		
		for(int n=1;n<=10;n++) {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			map.put(n, fact);
			
		}
		System.out.println("The factorial of  1 to 10 are :"+map);
		
		//Getting particular element
		System.out.println("The factorial of 5 is "+ map.get(5));
		
		//REmoving the particular element from treeMap
		map.remove(5);
		System.out.println(map);      //5 is removed 
	}

}
