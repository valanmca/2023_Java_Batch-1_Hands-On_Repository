package com.jeban.JAVA8;

interface MyInterface{
	int calc(int a,int b);
}

class NormalClass implements MyInterface{
	public int calc(int a,int b) {
		return a+b;
	}
}
class NormalClass1 implements MyInterface{
	public int calc(int a,int b) {
		return a-b;
	}
}
public class LamdaExpression {

	public static void main(String[] args) {
////		NormalClass obj=new NormalClass();
////		obj.calc(20, 30);
//		MyInterface sum = (a, b) -> a + b;
//        System.out.println("Addition : "+sum.calc(10,20));
//        
//        MyInterface sub = (a, b) -> a - b;
//        System.out.println("Subtraction : "+sub.calc(10,20));
		double a=0.2;
		double b=0.4;
		double c=a+b;
		System.out.println(c);

	}

}
