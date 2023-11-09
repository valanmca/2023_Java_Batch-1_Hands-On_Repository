package com.jeyavel.core.java8;

@FunctionalInterface
interface MyInterface{
	int calc(int a, int b);
	
}

//Lambda Does Not Require Implementing Class 
//class NormalClass implements MyInterface{
//	public int calc(int a,int b) {
//		return a+b;//Addition 
//	}
//}
//
//class NormalClass1 implements MyInterface{
//	public int calc(int a,int b) {
//		return a+b;//Subraction
//	}
//}



public class Lambdaexpressions {

	public static void main(String[] args) {
		
	//Normal way 
//	System.out.println("Normal Way");
//    NormalClass add = new NormalClass();
//    int sum = add.calc(10, 20);
//    System.out.println("Sum:"+ sum);
	
    
    //LambdaFunction way-Just in One line
	System.out.println("LambdaFunction Way");
    MyInterface sum1 = (a,b)->a+b;
    System.out.println("Addition: "+sum1.calc(20,45));
    
    MyInterface sum2 = (a,b)->a-b;
    System.out.println("Subraction: "+sum2.calc(20, 10));
    
	}

}
