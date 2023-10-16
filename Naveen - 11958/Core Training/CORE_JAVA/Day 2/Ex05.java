package com.naveen.day2;
/* StringBuffer is mutable objects in Java(Without reassigning the content it 
 * modifies the content(mutable strings))*/
public class Ex05 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World");
		System.out.println(sb); //Java World
		
		sb.capacity();
		System.out.println(sb.capacity());
	}

}
