package com.madhan.coreday11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(10, "Madhan");
		map.put(11, "Mad");
		map.put(20, "han");
		System.out.println(map);
		map.put(null, "Kumar");
		System.out.println(map);
		System.out.println(map.get(11));
		map.remove(20);
		System.out.println(map);
		
		//Way-1
		Set<Integer>set=map.keySet();
		System.out.println(set);
		Iterator<Integer> it =set.iterator();
		while(it.hasNext())
		{
			Integer key=it.next();
			System.out.println(key+ "=>" + map.get(key));
		}
		
		//Way-2
			Set<Entry<Integer,String>> set1=map.entrySet();
			System.out.println(set1);
			Iterator<Entry<Integer,String>> it1=set1.iterator();
			while(it1.hasNext())
			{
				Entry<Integer,String> e=it1.next();
				System.out.println(e.getKey()+"=>"+e.getValue());
			}
			
		
	}

}
