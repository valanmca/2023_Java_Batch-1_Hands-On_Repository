package com.mahesh.core_java_day_13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapIntro {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "Mahesh");
		map.put(20, "kumar");
		System.out.println(map);
		map.put(30, "Mahesh kumar");
		map.put(null, "rajesh");
		System.out.println(map);
		
		System.out.println("Geting value based on Key :"+map.get(null));
		System.out.println("Removing value based on key : "+map.remove(null));
		System.out.println(map);
		
		// 1st Way to iterator
		
		Set<Integer> set = map.keySet();
		System.out.println(set);//[20, 10, 30]
		
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			Integer key = (Integer) it.next();
			System.out.println(key+" => "+map.get(key));
		}

		//2nd Way
		Set<Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		//entry is used to bind the key and value pair into single
		
		Iterator<Entry<Integer,String>> it1 = set1.iterator();
		while(it1.hasNext())
		{
			Entry<Integer,String > e = it1.next();
			System.out.println(e.getKey()+" => "+e.getValue());
		}

	}

}
