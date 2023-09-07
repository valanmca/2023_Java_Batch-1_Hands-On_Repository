package com.madhan.day12;

class Addition
{
	int a;
    int b;

	 Addition(int a,int b)
	{
		this(2.0d,2.0d);
		System.out.println(a+b);
	}
	
	 Addition(float a,float b)
	{
		this(2,2);
		System.out.println(a+b);
	}
	
	 Addition(double a,double b)
	{
		System.out.println(a+b);
	}
}

public class OverloadingRevision {

	public static void main(String[] args) {
		Addition ad=new Addition(2.0f,2.0f);
//		ad.add(2, 2);
//		ad.add(2.0f, 2.0f);
//		ad.add(4.0d, 4.0d);

	}

}
