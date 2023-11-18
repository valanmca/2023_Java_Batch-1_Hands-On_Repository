package Core_Topic_Domnic_Day_13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
    HashMap<Integer,String> map= new HashMap<Integer,String>();
    
    map.put(10, "Domnic");
    map.put(20, "Purush");
    map.put(30, "Aravind");
    System.out.println(map);
    map.put(30, "Shiva");
    System.out.println(map); //it will replace if we give duplicate key
    map.put(null, "Dev");
    System.out.println(map); // map will accept null value
    map.put(null, "Mahesh");
    System.out.println(map); // null will also be replaced 
    map.remove(20);
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
