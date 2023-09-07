
//Getting factorial of the 10 values and,using get() to display Factorial output of 5  
//and ,Using Remove() Delete the element 5 and display it

package com.jeyavel.day5;
import java.util.Collections;
import java.util.TreeMap;
public class TreeMapExFactorial {

	public static void main(String[] args) {//using key values to take Ass or Desc orders
		TreeMap<Integer,String> map = new TreeMap<Integer,String>(Collections.reverseOrder());
		
	/*	for(int n=0;n<=10;n++) {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			map.put(n, fact);
			
		}
		System.out.println(map);
		System.out.println("Factorial of 5 is " + map.get(5));
		
		map.remove(5);*/
		map.put(10, "jeb");
		map.put(11,"you");
		System.out.println(map);

	}

}
