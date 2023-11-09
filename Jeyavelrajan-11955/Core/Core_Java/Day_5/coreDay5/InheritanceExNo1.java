package com.jeyavel.coreDay5;
// default constructor is not always optional while the super class contains no constructor 
// if we stop the inheritance  using     Indirectly-private keyword  Directly using-final keyword
//Constructor Cannot be static 
//we cannot inherit  constructor , private 
class a{
    a(){
		System.out.println("A");
	}
	a(int a){
		System.out.println("A1");
	}
	
}
class b extends a{
	b(){
		super(5);
		System.out.println("B");
	}
	b(int b){
		this();
		System.out.println("B1");
	}
}

public class InheritanceExNo1 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		b obj = new b(5);

	}

}
