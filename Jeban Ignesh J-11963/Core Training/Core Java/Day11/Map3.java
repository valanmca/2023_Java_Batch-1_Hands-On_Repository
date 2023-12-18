package com.jeban.Day11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(20, "Jeban");
		map.put(30, "Ignesh");
		map.put(50, "Vikram");
		map.put(60, "Mac");
		map.put(40, "Jeban");
		System.out.println(map);
		System.out.println(map.get(60));
		map.put(0, "Sara");
		map.remove(10);
		System.out.println(map);

//		Way1
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
