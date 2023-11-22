package com.gayathri.day16Java11Features;

interface StringOper{
	String concat(String left,String right);
}

public class P10VarLambda {

	public static void main(String[] args) {
		StringOper str = (var left, var right) -> left+right;
		String op = str.concat("Hello","world");
		System.out.println(op);
//
//		IntegerOper intop = (var left, var right) -> left+right;
//		int op1 = 
	}

}
