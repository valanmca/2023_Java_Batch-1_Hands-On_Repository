package com.madhan.coreday11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapEx2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(10, "Madhan");
		map.put(11, "Mad");
		map.put(20, "han");
		System.out.println(map);
		map.put(null, "Kumar");
		System.out.println(map);
		System.out.println(map.get(11));
		map.remove(20);
		System.out.println(map);
		
		Set<Integer>set=map.keySet();
		System.out.println(set);
		Iterator<Integer> it =set.iterator();
		while(it.hasNext())
		{
			Integer key=it.next();
			System.out.println(key+ "=>" + map.get(key));
		}
	}

}
