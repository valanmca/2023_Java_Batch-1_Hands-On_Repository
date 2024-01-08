package com.prime;

public class Prime {

	public boolean isPrime(int a) {

		boolean temp = true;
		int mid=a/2;

		if (a == 0 || a == 1) {
			temp = false;
		} else {

			for (int i = 2; i <= mid ; i++) {

				if (a % i == 0) {
					temp = false;
					break;
				} 
				
			}
			
		}
		return temp;

		
	}

	public static void main(String[] args) {

		
	}

}
