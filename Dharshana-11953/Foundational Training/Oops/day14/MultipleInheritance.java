package com.dharshu.day14;

//Multiple Inheritance using Interface

interface One{
	int a=10;  //public  static   final
}

interface Two{
	int a=10;   //public   static   final
}

interface Three extends One,Two{  //Multiple Inheritance
	 void addition();   //public abstract
}

class Calc implements Three{
	public void addition() {
		System.out.println("Addition:"+(One.a+ Two.a)); //we can over come the ambiguous problem
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Calc obj=new Calc();
		obj.addition();

	}

}
