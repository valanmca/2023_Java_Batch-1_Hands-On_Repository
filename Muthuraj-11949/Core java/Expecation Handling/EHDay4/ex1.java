package EHDay4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ex1 {

	public static void main(String[] args) {
      
		HashMap<Integer ,String> map=new HashMap<Integer,String>();
		
		map.put(20, "Muthu");
		map.put(10, "Raj");
		map.put(30, "Kumar");
		System.out.println(map);
		map.put(null, "Valan");
		System.out.println(map);
		System.out.println(map.get(10));/// Raj
		map.remove(10);
		System.out.println(map);
		
		
		//way 1
		Set<Integer> set=map.keySet();
		System.out.println(set);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			Integer key =it.next();
					
					System.out.println(key +"=>"+map.get(key));
		}
		
		
		//way 2
		Set<Entry<Integer,String>> set1 =map.entrySet();
	   System.out.println(set1);
		Iterator<Entry<Integer,String>> it1=set1.iterator();
		while(it1.hasNext()) {
			Entry<Integer,String> e=it1.next();
			System.out.println(e.getKey()+"=>"+e.getValue());	
		}
	}
}
