package com.mahesh.Oops_day14;

interface one{
	int var1 =10;//public static final
}

interface two{
	int var2 =5;
}

interface  task extends one,two
{
	void sum(int a,int b);
	void sub(int x1,int x2);
}


class calculate implements task
{
	public void sum(int x,int y)
	{
		System.out.println("Add two values : "+(x+y));
	}
	public void sub(int v1,int v2)
	{
		System.out.println("Subract two values : "+(v1-v2));
	}
}
public class Mutiple_Inheritance {

	
	public static void main(String[] args) {
	
		calculate obj = new calculate();
		obj.sum(6, 3);
		obj.sub(4, 2);
		
		System.out.println("Interface one var1 : "+one.var1); //inside the interface 
									 //variable considered as public static final
		System.out.println("Interface two var2 : "+two.var2);//so we can call the variable by using interface name

	}

}
