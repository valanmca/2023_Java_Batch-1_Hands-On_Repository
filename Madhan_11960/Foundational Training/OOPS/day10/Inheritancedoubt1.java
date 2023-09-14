package com.madhan.day10;
class A
{
	int add() {
	
       int a=10;
	   int b=10;
	   int sum=a+b;
	   return sum;
	}
	
}

class B
{
	A obj=new A();
	void m1() {
		
		System.out.println(obj.add());
	}
}

public class Inheritancedoubt1 {

	public static void main(String[] args) {
		
            B obj2=new B();
            obj2.m1();
            
	}

}
