package com.dharshu.day15;

interface VarLambda {
    String concat(String a, String b);
}

public class Var_Lambda {

	public static void main(String[] args) {
		

        // using var keyword
		VarLambda s  = (var a, var b) -> a + b;       	
      String result = s.concat("Hello", " World");
      System.out.println(result);


	}

}
