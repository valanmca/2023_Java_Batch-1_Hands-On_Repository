package com.mahesh.core_java_day_06;

class show
{int a =20;
	static void disp()
	{
		System.out.println("Method 1 exe");
	}
}
class view extends show
{int a=40;
	static void disp()
	{
		System.out.println("Method 2 exe");
	}
	
}
public class Static_Method {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show tell = new show();
		show.disp();
		System.out.println(tell.a); // overriding completely based on object,so static method can't be override.

	}

}
