package com.mahesh.core_java_day_09;

public class Finally {

	public static void main(String[] args) {

		System.out.println("Before Exception");
		try {
			throw new Exception("");
		}

		catch (Exception e) {
			System.out.println("Exception : " + e);
		}

		finally {
			System.out.println("Finally");
		}

		System.out.println("Thank you");
	}

}
