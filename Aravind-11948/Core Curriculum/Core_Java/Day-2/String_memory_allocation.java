package com.core.day_02;

public class String_memory_allocation {
	public static void main(String args[])
	{
		
	
	String s1=new String("new string");// create in m1 memory location
	String s2=new String("new string"); // create in m2 memory location 
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2); // memory location are different
	
	System.out.println("without new keyword  it is literals");
	String d1="new string";   // create in1  memeory location
	String d2="new string";  // checks for java it is in s3 so its doesnt make new memory
	System.out.println(d1.equals(d2));
	System.out.println(d1==d2);
	
	System.out.println("Comparing s1 ans d1 ");
	
	System.out.println(s1.equals(d1));// true
	System.out.println(s1==d2);// false

}
}

