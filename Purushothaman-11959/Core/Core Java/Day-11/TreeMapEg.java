package com.purushoth.day_11;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEg {

	public static void main(String[] args) {
	
	TreeMap<Integer, String> map=new TreeMap<Integer, String>();
	map.put(40, "Sara");
	map.put(20, "Shiva");
	map.put(50, "Dom");
	map.put(30, "Shaji");
	System.out.println(map);
	
	//Way-1
	Set<Integer> set=map.keySet();
	System.out.println("Way-1");
	System.out.println(set);
	Iterator<Integer> it=set.iterator();
	while(it.hasNext()) {
		Integer key=it.next();
		System.out.println(key+"=>"+map.get(key));
	}
	
	//Way-2
	Set<Entry<Integer,String>> set1=map.entrySet();
	System.out.println("Way-2");
	System.out.println(set1);
	Iterator<Entry<Integer,String>> it1=set1.iterator();
	while(it1.hasNext()) {
		Entry<Integer,String> e=it1.next();
		System.out.println(e.getKey()+"=>"+e.getValue());
		
	}
	
	}

}
