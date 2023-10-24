package com.purushoth.day_03;

public class Method {
	Method(){
		System.out.println("A");
	}
	
	Method(int a){
		System.out.println("B");
	}

	
	public static void main(String[] args) {
		Method obj=new Method();//compile time (Method overloading)
		Method obj1=new Method(6);

	}

}
