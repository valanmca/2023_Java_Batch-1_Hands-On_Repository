package com.jeban.OOPsday2;//Addition of Instance and Static Variables

public class StatiIOOPs2 {
	int a=20;//instance variable
	
	static int b=45;//static variable

	public static void main(String[] args) {
		int c=10;
		System.out.println("Local Variable:"+c);
		
		StatiIOOPs2 obj=new StatiIOOPs2();
		System.out.println("Instance Variable:"+obj.a);
		
		System.out.println("Static Variable:"+StatiIOOPs2.b);
		System.out.println("Addition :"+(obj.a+StatiIOOPs2.b) );
		
		
	}

}
