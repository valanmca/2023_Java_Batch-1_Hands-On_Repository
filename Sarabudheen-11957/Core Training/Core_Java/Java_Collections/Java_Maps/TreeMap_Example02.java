package com.sara.CoreJava.Day_12;


import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap_Example02 {

	public static void main(String[] args) {

				// Creating TreeMap with {Key,Value} pair
				TreeMap<Integer, String> map = new TreeMap<Integer, String>();

				// Inserting key and values into the map
				map.put(20, "Sara");
				map.put(10, "Virat");
				map.put(30, "Kohli");
				System.out.println(map);// {20=Sara, 10=Virat, 30=Kohli}

				// Inserting value with null key
				map.put(40, "sara");
				System.out.println(map);// {null=sara, 20=Sara, 10=Virat, 30=Kohli}

				// Getting value from the map
				System.out.println(map.get(10));// Virat

				// Remove the value from the map
				System.out.println(map.remove(40));// sara

				System.out.println(map);// {20=Sara, 10=Virat, 30=Kohli}

				// Traversing the map
				// Way-1

				Set<Integer> set = map.keySet();
				System.out.println(set);
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					Integer key = it.next();
					System.out.println(key + " ==> " + map.get(key));
				}

				// Way-2

				Set<Entry<Integer, String>> set2 = map.entrySet();
				System.out.println(set2);
				Iterator<Entry<Integer, String>> it2 = set2.iterator();
				while (it2.hasNext()) {
					Entry<Integer, String> e = it2.next();
					System.out.println(e.getKey() + " ==> " + e.getValue());
				}

			}



	}


