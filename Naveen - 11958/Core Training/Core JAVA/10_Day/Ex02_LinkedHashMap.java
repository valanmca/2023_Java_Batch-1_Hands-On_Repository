package com.naveen.day_10;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

//Java Program to implement LinkedHashmap

public class Ex02_LinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(20, "Valan");
		map.put(10, "Mahesh");
		map.put(30, "Aravind");

		System.out.println(map);
		map.put(null, "Naveen");

		System.out.println(map);

		System.out.println(map.get(10)); // Mahesh
		map.remove(10);

		System.out.println(map);

		// Way -1
		Set<Integer> set = map.keySet();
		System.out.println(set);

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "  => " + map.get(key));
		}

		// Way -2
		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);

		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " => " + e.getValue());
		}

	}

}
