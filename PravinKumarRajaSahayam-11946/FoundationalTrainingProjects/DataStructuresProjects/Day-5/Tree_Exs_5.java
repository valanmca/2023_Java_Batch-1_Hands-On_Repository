//Programs for TreeMap using Print the values the key and Values and Updating the Values
package com.pravinkumar.day5;

import java.util.TreeMap;

public class Tree_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//Using key and Values Method for the Print the Output in the Ascending Order its will print in the key formats
		map.put(10, "Java");
		map.put(5, "C");
		map.put(20, "Python");
		map.put(15, "C++");
		System.out.println(map);

//While Updating the Element

		map.put(15, "PHP");
		System.out.println(map);
//Its will Updating the Values without any of the Error
	}

}
