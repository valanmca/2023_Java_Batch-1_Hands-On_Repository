package com.jeyandhan.day12;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkHasMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		map.put(10, "Jeyandhan");
		map.put(20, "Naga");
		map.put(30, "Jey");
		System.out.println(map);
		
		map.put(23, "Mahesh");
		System.out.println(map);
		map.put(null, "vel");
		System.out.println(map);
		map.put(null, "velan");
		System.out.println(map);
		
		System.out.println(map.get(null));
		
		map.remove(20);
		
		System.out.println(map);
		
		//way-1
		
		Set<Integer> set = map.keySet(); //converting the key to set
		System.out.println(set);
		Iterator<Integer>it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "=>"+ map.get(key));
		}
		
		//way-2
		
		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);
		
		Iterator<Entry <Integer, String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + "=>"+ e.getValue());
		}
	}

}
