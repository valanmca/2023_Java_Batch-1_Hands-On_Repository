package com.aravind.day12;
class Addition
{
	int a;
	int b;
	void add( int a,int b)
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
	void add(double a,double b)
	{
		System.out.println(a+b);
	
	}
	
	
}

public class MethodOverloadingAss {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(2, 4);
		obj.add(2.0f, 4.0f);
		obj.add(2.0d, 4.0d);
		
		

	}

}
