package com.jeban.Inheritance;

class M{
	String msg=myMethod();
	String myMethod() {
		return "A";
	}
}
class N extends M{
	String myMethod() {
		return "B";
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		M obj=new N();
		System.out.println(obj.msg);//B

	}

}
