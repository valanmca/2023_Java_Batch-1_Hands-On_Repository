package com.jeyavel.core.java11;

public class MainClass {
	
	private void display() {
		System.out.println("Hello From private method");
	}
	class NestedMain{
		void msg() {
			display();
		}
	}


	public static void main(String[] args) {
		
   		 MainClass m = new MainClass();
         MainClass.NestedMain n = m.new NestedMain();
         n.msg();
         

	}

}
