package com.naveen.day_14;

public class Nested {
	
		private void display() {
			System.out.println("hello from private method");
		}	
		class NestedMain{
			void msg() {
				display();
			}
		}
		

		
	public static void main(String[] args) {
		Nested m = new Nested();
		Nested.NestedMain n = m.new NestedMain();
		n.msg();
	}

}
