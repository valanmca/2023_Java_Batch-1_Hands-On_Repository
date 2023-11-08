package com.dharshu.day16;

public class Guarded_Pattern {
	public String patternMatch(Object obj) {
		return switch(obj) {
		case Integer i->"It is an Integer";
		case String s->"It is a String";
		//case Employee e && e.getDept().equals(“IT”)->"It is an Employee";
		default->”unknown”;
		};
}



	public static void main(String[] args) {

		Guarded_Pattern obj1=new Guarded_Pattern();
		obj1.patternMatch(3);
		
	}

}
