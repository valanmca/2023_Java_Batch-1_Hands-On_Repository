package com.shiva.core.day11;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

//  linked hashmap output comes in Insertion order

public class LinkedHashMap_Ex {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(10, "Babu ");
		map.put(30, "Vijay");
		map.put(20, "Ajith");
		map.put(null, "Raju");

		System.out.println(map);
		System.out.println("------------------------");

		Set<Integer> set = map.keySet();
		System.out.println(set);
		System.out.println("------------------------");

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " --> " + map.get(key));
		}
		System.out.println("------------------------");

		Set<Entry<Integer, String>> set1 = map.entrySet();
		Iterator<Entry<Integer, String>> it1 = set1.iterator();

		System.out.println(set1);
		System.out.println("------------------------");

		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();

			System.out.println(e.getKey() + " --> " + e.getValue());
		}
	}

}
