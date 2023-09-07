package com.shaji.Day11;

public class Constructor_Overloading {
		public Constructor_Overloading (String Name) {
			System.out.println("Welcome " + Name);
		}

		public Constructor_Overloading(int n) {
			int fact = 1;
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial : " + fact);
		}

		public Constructor_Overloading(int a, int b) {
			int sum = a + b;
			System.out.println("Sum : " + sum);

		}
	public static void main(String[] args) {
		Constructor_Overloading obj1 = new Constructor_Overloading("Shaji");
		Constructor_Overloading obj2 = new Constructor_Overloading(5);
		Constructor_Overloading obj3 = new Constructor_Overloading(14,24);
	}

}
