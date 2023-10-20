package com.core.day_06;

interface One1{
	int a=10;
	
}

interface Two1   {
	int b=20;
}

interface Three extends  One1,Two1{ //Multiple inheritance 
	
	void sum();
}


	class Calculator1 implements Three {
		public void sum()
		{
			System.out.println("Sum = "+(a+b));
		}
	}


public class MultipleInheritance {

	public static void main(String[] args) {
		
		Calculator1 obj=new Calculator1();
		obj.sum();
		

	}

}
