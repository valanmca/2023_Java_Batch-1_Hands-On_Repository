package com.mahesh.core_java_day_06;

class Top {
	Top() {
		System.out.println("DEF PARENT CONSTRUCTOR");
	}

	Top(int a) {
		System.out.println("DEF PARENT CONSTRUCTOR WITH PARAMETER");
	}
}

class Below extends Top {
	Below() {
		super(4);
		System.out.println("DEF CHILD CONSTRUCTOR");
	}

	Below(int a) {
	
		this();
		System.out.println("DEF CHILD CONSTRUCTOR WITH PARAMETER");
	}

}

public class Super_key {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Below obj = new Below(5);
	}

}
