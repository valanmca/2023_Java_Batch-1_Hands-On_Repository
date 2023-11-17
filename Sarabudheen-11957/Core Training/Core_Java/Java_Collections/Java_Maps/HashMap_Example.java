//Java Collection - HashMap Example
package com.sara.CoreJava.Day_12;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Example {

	public static void main(String[] args) {
		// Creating HashMap with {Key,Value} pair
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// Inserting key and values into the map
		map.put(20, "Sara");
		map.put(10, "Virat");
		map.put(30, "Kohli");
		System.out.println(map);//{20=Sara, 10=Virat, 30=Kohli}

		// Inserting value with null key
		map.put(null, "sara");
		System.out.println(map);//{null=sara, 20=Sara, 10=Virat, 30=Kohli}

		// Getting value from the map
		System.out.println(map.get(10));//Virat

		// Remove the value from the map
		System.out.println(map.remove(null));//sara

		System.out.println(map);//{20=Sara, 10=Virat, 30=Kohli}
		
		//Traversing the map
		//Way-1
		
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " ==> "+map.get(key));
		}
		
		//Way-2
		
		Set<Entry<Integer,String>> set2 = map.entrySet();
		System.out.println(set2);
		Iterator<Entry<Integer,String>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Entry<Integer,String> e = it2.next();
			System.out.println(e.getKey()+ " ==> "+e.getValue());
		}

	}

}
