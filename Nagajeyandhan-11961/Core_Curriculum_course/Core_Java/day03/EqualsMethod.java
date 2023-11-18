// == vs equals.

package com.jeyandhan.day03;

public class EqualsMethod {

	public static void main(String[] args) {
		String s1 = new String ("Java");
		
		String s2 = new String ("Java");
		
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s1 == s2); //false. because its check the memory location.
 
	}

}
