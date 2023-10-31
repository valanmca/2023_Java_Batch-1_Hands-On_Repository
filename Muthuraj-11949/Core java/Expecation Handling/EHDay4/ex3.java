package EHDay4;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collections;

public class ex3 {

	public static void main(String[] args) {
		
	        // Map to store the elements 
	       TreeMap<Integer,String> treemap=new TreeMap<Integer,String>(Collections.reverseOrder()); 
	  
	        // Put elements to the map 
	        treemap.put(1, "muthu"); 
	        treemap.put(2, "raj"); 
	        treemap.put(3, "kumar"); 
	        treemap.put(4, "sara"); 
	        treemap.put(5, "jeban"); 
	  
	        Set set = treemap.entrySet(); 
	        Iterator i = set.iterator(); 
	  
	        // Traverse map and print elements 
	        while (i.hasNext()) { 
	            Map.Entry me = (Map.Entry)i.next(); 
	            System.out.print(me.getKey() + ": "); 
	            System.out.println(me.getValue()); 
	        } 
	    } 
}


