package com.jeyavel.core.java11;


interface StringOper{
	String concat(String left,String right);
}
interface IntegerOper{
	int add(int left,int right);
}

public class LambdaVar {

	public static void main(String[] args) {
		//Using Var keyword
		StringOper s = (var left,var right)->left+right;
		String op = s.concat("Hello ", " World");
		System.out.println(op);
		
		
		IntegerOper s1 = (var left,var right)-> left+right;
		Integer op1 = s1.add(23,90);
		System.out.println(op1);

	}

}
