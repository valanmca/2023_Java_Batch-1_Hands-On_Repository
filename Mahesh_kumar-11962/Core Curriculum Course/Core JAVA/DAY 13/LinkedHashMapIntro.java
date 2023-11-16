package com.mahesh.core_java_day_13;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapIntro {
	static LinkedHashMap<Integer, String> Lhashmap = new LinkedHashMap<Integer, String>();

	public static void main(String[] args) {

		Lhashmap.put(7, "Mahesh");
		Lhashmap.put(40, "Maran");
		Lhashmap.put(10, "Ram");
		Lhashmap.put(null, "Raja");
		Lhashmap.put(null, "Moorthy");// updating value
		Lhashmap.put(20, "Ragu");

		System.out.println(Lhashmap);

		// 1st Way to iterator

		Set<Integer> set = Lhashmap.keySet();
		System.out.println(set);// [20, 10, 30]

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key + " => " + Lhashmap.get(key));
		}

		// 2nd Way
		Set<Entry<Integer, String>> set1 = Lhashmap.entrySet();
		System.out.println(set1);
		// entry is used to bind the key and value pair into single

		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " => " + e.getValue());
		}

	}

}
