package com.dharshu.day11;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Ex_2_LinkedHashmap_Collection {

	public static void main(String[] args) {
		LinkedHashMap <Integer,String> map = new LinkedHashMap <Integer,String>();
		map.put(20, "Dharshu");
		map.put(10, "Minion");
		map.put(30, "Jenish");
		System.out.println(map);
		
		//null
		map.put(null, "Jeni");
		System.out.println(map);
		
		//to get the particular value
		System.out.println(map.get(10));
		
		//remove
		map.remove(10);
		
		System.out.println(map);
		
		//Way 1 to iterate the map
		//Converting all the keys into the Set
		Set<Integer> set= map.keySet();
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key= it.next();
			System.out.println(key+ " --> " +map.get(key));
		}
		
		//Way 2 to iterate the map
		//By using entry (key+value) converting the entire map into set.
		Set set1=map.entrySet();
		System.out.println(set1);
		
		//Way2 with Generics\
		Set<Entry<Integer,String>> set2= map.entrySet();
		System.out.println(set2);
		Iterator<Entry<Integer,String>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry <Integer,String>e= it2.next();
			System.out.println(e.getKey()+ " --> " +e.getKey());
		}

	}

}
