package Day_10_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

//HashMap order the objects in sorted way.

//null can be used in key in Hash map.

//If we use duplicate Key it will replace the old key value with the new one -> common for all

//LinkedHashMap order in the the given way -> null can be used .

//In Tree map we can't put null as a key - > will be sorted .


public class MainClass1 {

	public static void main(String[] args) {
		
		System.out.println("Enter your choice : 1,2,3");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String temp = "";
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1,"Matthew");
		map.put(2, "Barath");
		map.put(4, "Jeslin");
		map.put(3, "Jasin");
		
		System.out.println(map);
		map.put(4,"Manual");
		System.out.println(map);
		map.put(null, "Raina");
		System.out.println(map);
		map.put(null, "Garrie");
		System.out.println(map);
		
//		Getting a particular value 
		
		System.out.println("Display the paticular value for the key : "+map.get(3));
		
		map.remove(null);
		System.out.println("After removing : " + map);
		
//		Iterating
		
//		Way -1 
		
		Set <Integer> set=map.keySet();
		
		System.out.println(set);
		
		Iterator <Integer> it= set.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("Key : "+key + " Value : "+map.get(key));
		}
		
		
//		Way -2
		
		Set<Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		
		Iterator<Entry<Integer,String>> it1 = set1.iterator();
		System.out.println("Way 2");
		while(it1.hasNext()) {
			Entry<Integer, String> key1 = it1.next();
			System.out.println(key1.getKey()+"=> "+key1.getValue());
		}
	}

}
