//Example for Lambda Expression
package com.sara.CoreJava.Day_16;

import java.util.ArrayList;

interface StringOperation {
	String concat(String left, String right);
}

public class LambdaExpression {

	public static void main(String[] args) {

		// Lambda Expression
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(9);
		numbers.add(23);
		numbers.add(1);
		numbers.forEach((n) -> {
			System.out.println(n);
		});

		// Lambda Expression using var keyword

		StringOperation s = (var left, var right) -> left + right;
		String op = s.concat("Virat", "Kohli");
		System.out.println(op);

	}

}
