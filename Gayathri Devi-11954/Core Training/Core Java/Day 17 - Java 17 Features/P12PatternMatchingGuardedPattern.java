package com.gayathri.day17Java17Features;
public String patternMatch(Object obj) {
	return switch(obj) {
	case Integer i->"It is an Integer";
	case String s-> "It is a String";
	case Employee e && e.getDept().equals(“IT”)->"It is an Employee";
	default->”unknown”;
	};
}

public class P12PatternMatchingGuardedPattern {
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
