package com.core.day_09;
// wrapper class 

public class WrapperClass {

	public static void main(String[] args) {
		 // old Syntax
		
		int a =10;// primitive 
		
		Integer obj1=new Integer(a);  //boxing 
		
		int b=obj1.intValue();
		
		//jdk1.5
		
		int g=10;
		
		Integer i=Integer.valueOf(g);//converting int into Integer explicitly  
		Integer j=g;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		
		
		Integer e=new Integer(3);    
		int k=e.intValue();//converting Integer to int explicitly  
		int l=e;//unboxing, now compiler will write a.intValue() internally   
		
		
		// practice 
		int m=10;
		Integer obj=m; //int to object
		
		int n=obj;// obj to int 
		
		

	}

}
