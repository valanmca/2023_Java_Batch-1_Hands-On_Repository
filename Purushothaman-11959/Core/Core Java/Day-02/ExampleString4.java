package com.purushoth.day_02;

public class ExampleString4 {

	public static void main(String[] args) {
		String s1=new String("Java");
		String s2=new String("Java"); //Because new memory location will be allocated.
		
		System.out.println(s1.equals(s2));//True 
		
		System.out.println(s1==s2);//False (For string comparison we should not use ==) To check memory location
        
		StringBuffer s3=new StringBuffer("Java");
		StringBuffer s4=new StringBuffer("Java");
		
		System.out.println(s3==s4); //False
		
		String s5="Java";
		String s6="Java"; // In literals without new it will take same memory location s5,s6
		
		System.out.println(s5==s6); //True Because same memory location.
	}

}
