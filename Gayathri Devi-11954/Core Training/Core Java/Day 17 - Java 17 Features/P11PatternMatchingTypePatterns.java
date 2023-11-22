package com.gayathri.day17Java17Features;
//it will display error at compile time
public class P11PatternMatchingTypePatterns {

	static float getFloat(Object o) {
		return switch (o) {
		case Integer i -> i.floatValue();
		case Double d -> d.floatValue();
		case String s -> Float.parseFloat(s);
		default -> 0f;
		};
	}

	public static void main(String[] args) {

		System.out.println("Integer : " + getFloat(12));
		System.out.println("Double : " + getFloat(12.33d));
		System.out.println("String : " + getFloat("22.32"));

	}
}
