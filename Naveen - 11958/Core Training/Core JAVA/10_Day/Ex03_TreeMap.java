package com.naveen.day_10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex03_TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(20, "Valan");
		map.put(10, "Mahesh");
		map.put(30, "Aravind");
		
		System.out.println(map);
		map.put(10, "Naveen");
		
		System.out.println(map);
		
		System.out.println(map.get(10)); //Mahesh
		map.remove(10);
		
		System.out.println(map);
		
		//Way -1
		Set<Integer> set = map.keySet();
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +"  => "+map.get(key));
		}
		
		//Way -2
		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);
		
		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey()+ " => "+e.getValue());
		}
		
		System.out.println(map.containsKey(10));
	}

}
