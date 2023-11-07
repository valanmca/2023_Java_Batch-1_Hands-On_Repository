//package com.naveen.day_15;
//
//public class Ex11_Pattern {
////	static float getFloat(Object o) {
////		 return switch (o) {
////		 case Integer i -> i.floatValue();
////		 case Double d -> d.floatValue();
////		 case String s -> Float.parseFloat(s);
////		 default -> 0f;
//		 };
//		
//	public static void main(String[] args) {
//		System.out.println("Integer : "+getFloat(12));
//		System.out.println("Double : "+getFloat(12.33d));
//		System.out.println("String : "+getFloat("22.32"));
//
//	}

//	public String patternMatch(Object obj) {
//		return switch(obj) {
//		case Integer i->"It is an Integer";
//		case String s-> "It is a String";
//		case Employee e && e.getDept().equals(“IT”)->"It is an Employee";
//		default->”unknown”;
//		};
//}

//public String patternMatch(Object obj) {
//
//		return switch(obj) 
//                  {
//		case Integer i->"It is an Integer";
//		case String s-> "It is a String";
//		case Employee e->"It is an Employee"
//		case null->"Null pointer";
//		};
//}



//
//}
