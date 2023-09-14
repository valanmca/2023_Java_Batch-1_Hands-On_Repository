package com.muthu.day9;

public class ex8 {
	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial:" + n + "is" + fact);
	}

	static void digitcount(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Total digit:" + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex8 obj = new ex8();
		obj.factorial(6);

		ex8.digitcount(456);

	}

}
