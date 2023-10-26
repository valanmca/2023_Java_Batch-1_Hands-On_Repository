package com.gayathri.day5;

class A4{
	String msg = myMethod();
	String myMethod(){
		return "A";
	}
}
class B4 extends A4{
	String myMethod() {
		return "B";
	}
}
public class MethodOverRideEx {

	public static void main(String[] args) {
		//over ride based on object
		//B4 obj = new B4();//B
		A4 obj = new B4();//B
		obj.myMethod();
		System.out.println(obj.msg);
		
		

	}

}
