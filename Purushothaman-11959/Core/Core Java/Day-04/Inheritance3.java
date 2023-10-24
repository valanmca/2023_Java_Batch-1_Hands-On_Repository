package com.purushoth.day_04;

class A2{
	//A2(int a){
		//System.out.println("A 1"); 
	//}
}

class B2 extends A2{
	B2(){
		System.out.println("B");
	}
	B2(int a){
		this();
		System.out.println("B 1");// If no constructor it will take it as empty. or If there is no 
		// default constructor but other constructor it doesn't take it as empty.
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		B2 obj=new B2(5);

	}

}
