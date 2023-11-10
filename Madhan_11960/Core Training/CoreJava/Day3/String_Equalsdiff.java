package com.madhan.coreday3;

public class String_Equalsdiff {

	public static void main(String[] args) {
		
//With new keyword ,you are storing data in heap memory, it will allocate separate memory for each variable.
		String s1=new String("New String"); 
		String s2=new String("New String");
		System.out.println(s1.equals(s2)); //true 
		
		System.out.println(s1==s2); //false
		
		//Without using new Keyword, it is called literals it allocates in same memory.
		String s3="New String";
		String s4="New String";
		System.out.println(s3.equals(s4)); //true
		
		System.out.println(s3==s4); //true
		
		System.out.println(s1.equals(s4)); //true
		System.out.println(s1==s3);// false because different memory allocation.
		

	}

}
