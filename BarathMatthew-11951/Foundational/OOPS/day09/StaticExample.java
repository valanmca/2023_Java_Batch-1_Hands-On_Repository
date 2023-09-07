package com.matthew.day09;

public class StaticExample {
		static int a =10;
		public static void main(String[] args) {
			//creating an object
			StaticExample obj1 = new StaticExample();
			StaticExample obj2 = new StaticExample();
			
			System.out.println("obj1 "+obj1.a);
			System.out.println("obj2 "+obj2.a);
			
			obj1.a = 40;
			
			System.out.println("obj1 "+obj1.a);
			System.out.println("obj2 "+obj2.a);
				
		}

}
