package com.swetha.features;

public class nullPointer {

	public static void main(String[] args) {

		String day="Monday";
		String result="";
		
		result=switch(day) {
		case "Saturday","Sunday"-> "8 am";
		case "Monday","Tuesday" -> "6 am";
		//case null->"NUll pointer";
		default-> "5 am"; 	
		};
		System.out.println(result);
	}

	
//	public class Example1 {
//		static float getFloat(Object o) {
//		    return switch (o) {
//		        case Integer i -> i.floatValue();
//		        case Double d -> d.floatValue();
//		        case String s -> Float.parseFloat(s);
//		        default -> 0f;
//		    };
//		}
//		
//		public static void main(String[] args) {
//			System.out.println("Integer : "+getFloat(12));
//			System.out.println("Double : "+getFloat(12.33d));
//			System.out.println("String : "+getFloat("22.32"));
//			
//		}
	}
	
	
	//Guarded
//	public class Example2 {
//		static float getFloat(Object o) {
//		    return switch (o) {
//		        case String s && s.length() > 0 -> Float.parseFloat(s);
//		        default -> 0f;
//		    };
//		}
//		public static void main(String[] args) {
//			System.out.println("String : "+getFloat("12.45"));
//		}
//	}
//	
//	
//	
//	
//
//}
