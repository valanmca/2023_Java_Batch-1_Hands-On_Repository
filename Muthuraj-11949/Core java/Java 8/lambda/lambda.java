package com.muthu.lambda;


interface MyInterface{
	int calc(int a,int b);
}
/*class NormalClass implements MyInterface {
	
	public int calc(int a,int b) {
		return a+b;
	}
}
class NormalClass1 implements MyInterface {
	
	public int calc(int a,int b) {
		return a+b;
	}
}*/
public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface sum=(a, b) -> a + b;
		
		System.out.println("Addition:"+sum.calc(10,20));
		

		MyInterface sub=(a, b) -> a - b;
		
		System.out.println("Subtraction:"+sub.calc(10,20));
		/*NormalClass add=new NormalClass();
		int sum=add.calc(10, 20);
		System.out.println("Sum:"+sum);
		
		

		NormalClass1 sub=new NormalClass1();
		int Subtract=sub.calc(10, 20);
		System.out.println("Subtract:"+Subtract);*/

	}

}