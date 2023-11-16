package com.mahesh.core_java_day_09;

public class Ubnormal_Exception {

	public static void main(String[] args) {
		try {
			// int variable = 10/0;
			int reference = 10 / 0;
		}

		catch (NullPointerException e) {
			System.out.println(e);

			// Exception in thread "main" java.lang.ArithmeticException: / by zero
			// at
			// com.mahesh.core_java_day_09.Ubnormal_Exception.main(Ubnormal_Exception.java:8)
		}

		/*
		 * catch(ArithmeticException e) { System.out.println(e); //
		 * java.lang.ArithmeticException: / by zero }
		 */
		catch (Exception e) {
			System.out.println(e);
			// java.lang.ArithmeticException: / by zero
		}
	}

}
