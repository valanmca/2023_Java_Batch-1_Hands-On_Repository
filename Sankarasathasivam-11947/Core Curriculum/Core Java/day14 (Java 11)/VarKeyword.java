package com.shiva.core.day14;

interface Stringopr {
	String concat(String left, String right);
}

interface Stringopr1 {
	int add(int left, int right);
}

public class VarKeyword {

	public static void main(String[] args) {
		Stringopr s = (var left, var right) -> left + right;
		String op = s.concat("Hello", "world");
		System.out.println(op);

		Stringopr1 s1 = (var left, var right) -> left + right;
		int op1 = s1.add(10, 20);
		System.out.println(op1);

	}

}
