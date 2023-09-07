package com.aravind.day13;
abstract class Parent
{
	Parent(int a,int b)
	{
		int c=a+b;
		System.out.println("abstract class constructor="+c);
	}
	public abstract  void message();
	void mess()
	{
		System.out.println("abstract class");
	}
	
}
class subclass1 extends  Parent 
{
	subclass1()
	{
		super(10,10);
	}
	public void message()
	{
		System.out.println("first subclass");
		
	}
}
class subclass2 extends  Parent 
{
	subclass2()
	{
		super(20,30);
		
	}
	public void message()
	{
		System.out.println("second subclass");
		
	}
}





public class practise2 {

	public static void main(String[] args) {
		Parent obj3=new subclass1();
		obj3.mess();
		//subclass1 obj=new subclass1();
		//obj.message();
		//subclass2 obj1=new subclass2();
		//obj1.message();
		//Parent obj3=new subclass1();
		//obj3.mess();
		

	}

}
