package com.shiva.core.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// hashmap and linkehashdmap have null key

public class HashMap_Example {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(20, "Shiva");
		map.put(50, "Mahesh");
		map.put(30, "Purushoth");
		map.put(60, "Domnic");
		map.put(10, "jeban");
		map.put(null, "Aravind");

		System.out.println(map);
		System.out.println("------------------------");
		System.out.println(map.get(20));
		System.out.println(map.remove(50));

		System.out.println("------------------------");
		System.out.println(map);
		System.out.println("------------------------");
		
		// way to iterate
		Set<Integer> set = map.keySet();

		System.out.println(set);
		System.out.println("------------------------");

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " --> " + map.get(key));
			System.out.println("------------------------");
		}

		// way 2
		System.out.println("way--2 ");
		Set<Entry<Integer, String>> set1 = map.entrySet();

		System.out.println(set1);
		System.out.println("------------------------");
		
		Iterator<Entry<Integer, String>> it1 = set1.iterator();

		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " --> " + e.getValue());
		}
	}

}
