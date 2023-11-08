package Day_10_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MyPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 - LinkedHashMap , 2- HashMap,3 - TreeMap");
		int choice = sc.nextInt();  

        Map<Integer,String> map;

        if (choice == 1) {
            map = new LinkedHashMap<>();
            System.out.println("Using LinkedHashMap");
        } else if (choice == 2) {
            map = new HashMap<>();
            System.out.println("Using HashMap");
        } else if (choice == 3) {
            map = new TreeMap<>();
            System.out.println("Using TreeMap");
        } else {
            System.out.println("Invalid choice");
            return;
        }
        
        map.put(1,"Matthew");
		map.put(2, "Barath");
		map.put(4, "Jeslin");
		map.put(3, "Jasin");
		
		System.out.println(map);
		map.put(4,"Manual");
		System.out.println(map);
		if(choice !=3) {
			map.put(null, "Raina");
			System.out.println(map);
			map.put(null, "Garrie");
			System.out.println(map);
		}
		
//		Getting a particular value 
		
		System.out.println("Display the paticular value for the key : "+map.get(3));
		
//		map.remove(null);
		System.out.println("After removing : " + map);
		
//		Iterating
		
//		Way -1 
		
		Set <Integer> set=map.keySet();
		
		System.out.println(set);
		
		Iterator <Integer> it= set.iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println("Key : "+key + " Value : "+map.get(key));
		}
		
		
//		Way -2
		
		Set<Entry<Integer,String>> set1 = map.entrySet();
		System.out.println(set1);
		
		Iterator<Entry<Integer,String>> it1 = set1.iterator();
		System.out.println("Way 2");
		while(it1.hasNext()) {
			Entry<Integer, String> key1 = it1.next();
			System.out.println(key1.getKey()+"=> "+key1.getValue());
		}

	}

}
