package Day_12;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Treemapp {

	public static void main(String[] args) {
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
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
		
		//Way-1
		Set<Integer> set=map.keySet();
		System.out.println(set);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) 
		{
			Integer key=it.next();
			System.out.println(key+"=>"+map.get(key));
		}
		
		//Way-2
		Set<Entry<Integer, String>> set1=map.entrySet();
		System.out.println(set1);
		Iterator<Entry<Integer,String>> it1=set1.iterator();
		while(it1.hasNext()) 
		{
			Entry<Integer,String> e=it1.next();
			System.out.println(e.getKey()+"=>"+e.getValue());
		}
				
	}

	}

}
