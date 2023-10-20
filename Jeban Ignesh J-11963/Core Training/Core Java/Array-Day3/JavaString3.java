package com.jeban.JavaArray;

//Double Equal(==) vs Equal methods in String
public class JavaString3 {

	public static void main(String[] args) {
		String s1=new String("Java");//new=it take a new memory
		String s2=new String("Java");
		System.out.println(s1.equals(s2));//True
		
		System.out.println(s1==s2);//False
		
		String s3="Java";
		String s4="Java";
		System.out.println(s3.equals(s4));//True
		System.out.println(s3==s4);//True
		
		//String Buffer
		StringBuffer sb=new StringBuffer("Java");
		StringBuffer sc=new StringBuffer("Java");
		System.out.println(sb.equals(sc));//False
		System.out.println(sb==sc);
		
		System.out.println(s1.equals(s3));//True
		System.out.println(s1==s3);//False
		
		

	}

}
