package com.shiva.core.day11;

import java.util.Iterator;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap_Ex {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "aravind ");
		map.put(30, "dom");
		map.put(20, "jeban");
		System.out.println(map);

		// way 1 of iterator
		Set<Integer> set = map.keySet();
		System.out.println(set);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " --> " + map.get(key));
		}

		// way 2 of iterator

		Set<Entry<Integer, String>> set1 = map.entrySet();
		Iterator<Entry<Integer, String>> it1 = set1.iterator();

		System.out.println(set1);

		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " --> " + e.getValue());
		}

	}

}