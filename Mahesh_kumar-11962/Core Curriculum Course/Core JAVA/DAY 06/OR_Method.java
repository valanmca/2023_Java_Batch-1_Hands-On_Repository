package com.mahesh.core_java_day_06;

class Ai
{
	String msg = my_method();
	String my_method()
	{
		return "Base";
	}
}
class Bi extends Ai
{
	
	String my_method()
	{
		return "Derived";
	}
}

public class OR_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ai ob = new Bi();
		System.out.println(ob.msg);

	}

}
