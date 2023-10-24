package com.purushoth.day_06;

public class Try1 {

	public static void main(String[] args) {
		try {
			int data=50/0;
			System.out.println("No error");
		}

		catch(Exception e) {
			System.out.println(e);
		}
	}

}
