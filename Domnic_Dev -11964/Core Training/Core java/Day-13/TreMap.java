package Core_Topic_Domnic_Day_13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreMap {

	public static void main(String[] args) {
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();
    
    map.put(10, "Domnic");
    map.put(20, "Aravind");
    map.put(30, "Shaji");
    //map.put(null, "Dev");  //Tree map can't accept null.
    System.out.println(map);
    
    //for traverse
    //method 1
    System.out.println("First method");
    System.out.println();
    Set<Integer> set=map.keySet();
    System.out.println(set);
    Iterator<Integer> it=set.iterator();
    while(it.hasNext()){
    	Integer key=it.next();
    	System.out.println(key +" => "+map.get(key));
    }
    
    //method 2
    System.out.println("Second method");
    System.out.println();
    Set<Entry<Integer,String>> set1=map.entrySet();
    System.out.println(set1);
    Iterator<Entry<Integer,String>> it1=set1.iterator();
    while(it1.hasNext()) {
    	Entry<Integer,String> e=it1.next();
    	System.out.println(e.getKey()+" => "+e.getValue());
    }
    
	}

}
