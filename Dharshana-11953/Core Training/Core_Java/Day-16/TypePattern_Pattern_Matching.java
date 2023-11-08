package com.dharshu.day16;

public class TypePattern_Pattern_Matching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This version is not support in our System
		return switch (o) {
		 case Integer i -> i.floatValue();
		 case Double d -> d.floatValue();
		 case String s -> Float.parseFloat(s);
		 default -> 0f;
		 };
		}
		public static void main(String[] args) {
			System.out.println("Integer : "+getFloat(12));
			System.out.println("Double : "+getFloat(12.33d));
			System.out.println("String : "+getFloat("22.32"));


	}

}
