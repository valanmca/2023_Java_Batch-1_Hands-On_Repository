package com.mahesh.core_java_day_17_v11;

interface StrOper
{
	String concat(String fLetter,String sLetter);
}
public class Lamda {

	public static void main(String[] args) {
	
		StrOper s = (var val1,var val2)->val1+val2;
		String op = s.concat("welcome", " RTZ");
		System.out.println(op);
		

	}

}
