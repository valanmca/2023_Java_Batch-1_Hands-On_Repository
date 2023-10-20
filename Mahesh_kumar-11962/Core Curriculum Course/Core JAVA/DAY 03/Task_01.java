package com.mahesh.core_java_day_03;

public class Task_01 {
	static String s1 = new String("MAHESH");
	static String s2 = new String("MAHESH");
    public static void main(String[] args)
    {
    	
    	String s3 = "MAHESH";
    	String s4 = "MAHESH";
    	System.out.println(s1==s2);//false double equals check the memory location.
    	System.out.println(s3==s4);/* true . 
    	String in pool memory (it will check first the "java" value there are not,
    	if it is there ,it directly linked with the variable )*/
    	
    	StringBuffer Buf_1 = new StringBuffer("MAHESH");
    	StringBuffer Buf_2 = new StringBuffer("MAHESH");
    	
    	System.out.println(Buf_1==Buf_2); //by using new key word we have different memory location.
    	
    }

}
