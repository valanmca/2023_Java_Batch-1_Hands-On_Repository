package com.jeban.OOPsday2;//Instance variable declare 
//Instance vs Static==Instance
public class OOPs3 {
	
	int a=10;
	

	public static void main(String[] args) {
		OOPs3 obj1=new OOPs3();
		OOPs3 obj2=new OOPs3();
		
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		
		obj1.a=20;
		
		System.out.println(obj1.a);//20
		System.out.println(obj2.a);//10

	}

}
