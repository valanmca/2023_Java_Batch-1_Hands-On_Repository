package com.purushoth.day_15;

interface StringOper{
	String concat(String left,String right);
}
public class varEg {
	public static void main(String[] args) {
		StringOper s=(var left,var right) -> left+right;
		String op=s.concat("Hello", "World");
		System.out.println(op);

	}

}
