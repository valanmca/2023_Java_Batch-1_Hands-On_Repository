package com.jeban.Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Map2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(20, "Jeban");
		map.put(10, "Naveen");
		map.put(30, "Sara");
		map.put(40, "Shajii");
		map.put(50, "Domnic");
		System.out.println(map);
		map.put(null, "Mahesh");
		System.out.println(map);
		map.get(map.get(10));// Naveen
		map.remove(10);
		System.out.println(map);

		// Way 1
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "==>" + map.get(key));
		}

		// Way 2
		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);
		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + "==>" + e.getValue());
		}

	}

}
