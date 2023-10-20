package com.core.day_06;
interface One2{
	int a=10;
	
}

interface Two2   {
	int a=20;
}

interface Three1 extends  One2,Two2{ //Multiple inheritance 
	
	void sum();
}


	class Calculator2 implements Three1 {
		public void sum()
		{
			System.out.println("Sum of a from Interface One And Two = "+(One2.a+Two2.a));
		}
	}


public class AmbiguousIssue {

	public static void main(String[] args) {
		Calculator2 obj=new Calculator2();
		obj.sum();
		

	}

}
