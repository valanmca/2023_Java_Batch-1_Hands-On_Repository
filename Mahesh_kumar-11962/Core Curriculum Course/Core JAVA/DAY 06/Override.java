package com.mahesh.core_java_day_06;

class  parent
{
	void display()
	{
		System.out.println("A");
	}
}
class child extends parent
{
	void display()
	{
		System.out.println("B");
	}
}
public class Override {

public static void main(String args[])
{
	child obj = new child();
	obj.display();
}
}
