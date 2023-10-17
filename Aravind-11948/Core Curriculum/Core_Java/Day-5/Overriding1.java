package com.core.day_05;
class a2{
	String msg=myMethod();
			
	String myMethod()
	{
		return "A";
	}
	
}

class b2 extends a2{
	
	String myMethod()
	{
		return "B";
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		a2 obj=new b2();
		System.out.println(obj.msg);
	}

}
