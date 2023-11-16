package com.mahesh.core_java_day_09;

public class Multi_Exception {

	public static void main(String[] args) {
		try {
			try {
				String s = null;
				System.out.println(s.length());
			} finally {
				System.out.println("\t");
				System.out.println("Inner Finally Block");
				System.out.println("\t---*---");
			}
		}

		catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("\t---*---");
		}

		finally {
			System.out.println("Outer Finally Block ");
			System.out.println("\t---*---");
		}
	}

}
