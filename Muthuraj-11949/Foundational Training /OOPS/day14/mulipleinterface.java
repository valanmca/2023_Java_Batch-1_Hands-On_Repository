package com.muthu.day14;
//multiple Inheritance using interface
//interface to interface using extends
interface one{
	int a=10;//public static final
}
interface two{
	int a=20;//public static final
}
interface three extends one,two{
	void addition();//public abstract
}
class Calculator3 implements three{
	public void addition() {
		System.out.println("addition :"+(one.a+two.a));
	}
}
public class mulipleinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 obj=new Calculator3();
        obj.addition();
	}

}
