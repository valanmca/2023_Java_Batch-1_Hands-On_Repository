package com.mahesh.core_java_day_13;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapIntro {

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		// tree map is stored in acending order
		tmap.put(20, "kumar");
		tmap.put(68,"Ragu");
		tmap.put(34,"Gokul");
		tmap.put(10, "Mahesh");
		tmap.put(20, "kumar");
		System.out.println(tmap);
		tmap.put(30, "Mahesh kumar");
		// tmap.put(null, "rajesh");
		// null is not accepting in TreeMap
		System.out.println(tmap);

		System.out.println("Geting value based on Key :" + tmap.get(10));
		System.out.println("Removing value based on key : " + tmap.remove(30));
		System.out.println(tmap);

		// 1st Way to iterator

		Set<Integer> set = tmap.keySet();
		System.out.println(set);// [20, 10, 30]

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key + " => " + tmap.get(key));
		}

		// 2nd Way
		Set<Entry<Integer, String>> set1 = tmap.entrySet();
		System.out.println(set1);
		// entry is used to bind the key and value pair into single

		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Entry<Integer, String> e = it1.next();
			System.out.println(e.getKey() + " => " + e.getValue());
		}

	}
}
