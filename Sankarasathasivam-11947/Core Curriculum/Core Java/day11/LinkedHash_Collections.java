package com.shiva.core.day12;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHash_Collections {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(30, "Shiva");
		map.put(40, "Dom");
		map.put(10, "Aravind");
		System.out.println(map);
		System.out.println("-------------------------------");

		// Way-1
		Set<Integer> set = map.keySet();
		System.out.println(map);
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " => " + map.get(key));
		}

		// Way-2
		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(map);
		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " => " + e.getValue());
		}
	}

}
