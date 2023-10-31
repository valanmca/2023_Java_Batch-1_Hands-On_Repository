package com.jenish.day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Ex_2_Collection_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(20, "Jenish");
		map.put(10, "Naveen");
		map.put(30, "Dharshana");
		System.out.println(map);
		map.put(null, "Gayathir");
		System.out.println(map);
		System.out.println(map.get(10)); 
		map.remove(30);
		System.out.println(map);
		//Way - 1
				Set<Integer> set = map.keySet();
				System.out.println(set);
				Iterator<Integer> it = set.iterator();
				while(it.hasNext()) {
					Integer key = it.next();
					System.out.println(key +" ==> " + map.get(key)); // null ==> Gayathir, 20 ==> Jenish, 10 ==> Naveen
				}
				//Way - 2 
				Set<Entry<Integer, String>> set1 = map.entrySet();
				System.out.println(set1);  //[null=Gayathir, 20=Jenish, 10=Naveen]
				Iterator<Entry<Integer, String>> it1 = set1.iterator();
				while(it1.hasNext()) {
					Entry<Integer, String> e = it1.next();
					System.out.println(e.getKey() + " ==> " + e.getValue()); //null ==> Gayathir, 20 ==> Jenish, 10 ==> Naveen

				}

	}

}
