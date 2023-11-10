package Day_12;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class linkedhashh {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(20,"hephzi");
		map.put(10, "emi");
		map.put(30, "sheeba");
		
		System.out.println(map);
		
		map.put(10, "emima");
		System.out.println(map);
		
		map.put(null, "mad");
		System.out.println(map);
		
		map.put(null, "matt");
		System.out.println(map);
		
		map.put(40, null);
		System.out.println(map);
		
		System.out.println(map.get(20));
		map.remove(30);
		System.out.println(map);
		
        
//        Way -1 
        
        Set <Integer> set=map.keySet();
        
        System.out.println(set);
        
        Iterator <Integer> it= set.iterator();
        
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println("Key : "+key + " Value : "+map.get(key));
        }
        
        
//        Way -2
        
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

	


