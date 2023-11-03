package com.shiva.core.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_Collections {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Shiva");
		map.put(20, "Sankar");
		map.put(30, "Satha");
		System.out.println(map);
		map.put(30, "Tamil");

		map.put(null, "Dom");
		System.out.println(map);
		System.out.println(map.get(10));
		map.remove(30);
		System.out.println(map);

		// Way-1
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " => " + map.get(key));
		}

		// Way-2
		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);
		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " => " + e.getValue());
		}
	}

}
