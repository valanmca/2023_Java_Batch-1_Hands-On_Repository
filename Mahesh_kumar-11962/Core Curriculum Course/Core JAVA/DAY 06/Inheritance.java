package com.mahesh.core_java_day_06;


class First
{
	First()
	{
		System.out.println("Parent Method");
	}
}
class Second extends First
{
	Second()
	{
		System.out.println("Child Method");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Second ob = new Second();

	}

}
