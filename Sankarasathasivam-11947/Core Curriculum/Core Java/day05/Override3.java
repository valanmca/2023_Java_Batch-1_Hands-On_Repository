package com.shiva.core.day05;

class C{
	String msg=myMethod();
	
	String myMethod() {
		return "C";
	}
}
class D extends C{
	String myMethod() {
	return "D";
	}
}
public class Override3 {

	public static void main(String[] args) {
		C obj=new D();
		System.out.println(obj.msg);
	}

}
