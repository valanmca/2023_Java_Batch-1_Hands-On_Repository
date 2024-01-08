package com.fact;

public class Factorial {

	public int getFactorial(int num) {
		int fact = 1;

		if (num == 0) {
			fact = 0;
		}

		else {

			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}

		}
		
		return fact;
	}

}
