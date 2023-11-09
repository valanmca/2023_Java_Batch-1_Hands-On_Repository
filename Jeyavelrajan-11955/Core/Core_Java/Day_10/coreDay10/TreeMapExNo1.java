package com.jeyavel.coreDay10;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExNo1 {

	public static void main(String[] args) {
		Map<Integer,String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(10, "Jeyavel");
		treeMap.put(20, "Matthew");
		treeMap.put(30, "Mahesh");
		treeMap.put(40, "Jeyanthan");
		treeMap.put(50, "raj");
		treeMap.put(50, "rajan");
		System.out.println(treeMap);
		System.out.println(treeMap.get(20));
		System.out.println(treeMap.remove(40)+"Removed");
		System.out.println(treeMap);
		
		
		//Way-1 converting all the keys into Set
		Set<Integer> set = treeMap.keySet();
		System.out.println(set);
		//And traverse it - using Iterator
		Iterator <Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "=>"+treeMap.get(key));
		}
		//Converting the Enter Map into Set
		Set<Entry<Integer,String>> set1 = treeMap.entrySet();
		//Merging the key and value - it is called asEntry (or) converting it into Entry
	    System.out.println(set1);
	    Iterator<Entry<Integer,String>> it1 = set1.iterator();
	    while(it1.hasNext()) {
	    	Entry<Integer, String> e = it1.next();
	    	System.out.println(e.getKey()+"=>"+e.getValue());
	    }
	    


	}

}
