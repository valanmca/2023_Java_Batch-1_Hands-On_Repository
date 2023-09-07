package com.aravind.day13;
abstract class calculate

{
	int a,b;
	calculate(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract void add();
	void sub()
	{
		int c=a-b;
		System.out.println("Sub ="+c);
		
	}
}

class Add extends calculate
{
	int n,m;
	Add(int n,int m)
	{
		super(n,m);
		this.n=n;
		this.m=m;
		
	}
	void add()
	{
		int c=n+m;
		System.out.println("class Add"+c);
		
	}
	
}

public class practiveabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj=new Add(20,10);
		obj.add();
		obj.sub();

	}

}
