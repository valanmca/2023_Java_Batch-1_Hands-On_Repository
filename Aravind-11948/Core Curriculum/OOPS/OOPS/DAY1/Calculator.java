package com.oops;
class cal{
	int a ,b;
	static int c,d;
	
	cal(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int add()
	{
		int c=a+b;
		return c;
	}
	
	int sub()
	{
		int c=a-b;
		return c;
	}
	
	static void mul(int c,int d) {
	System.out.println("multiplication"+c*d);
	
	}
	static void div (int c,int d) {
		System.out.println("division :"+c/d);
		
		}

	
}

public class Calculator {

	public static void main(String[] args) {
		cal obj=new cal (10,20);
		System.out.println("addition:"+obj.add());
		System.out.println("multiplication"+obj.sub());
		
		
      cal.mul(2,3);
      cal.div(6,3);
		
		

	}

}
