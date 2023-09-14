package com.shaji.Day11;

class keyword {
	int n;

	keyword() {
		this(5);
	}

	keyword(int n) {
		this.n = n;
		this.findFactorial();
	}

	public void findFactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}


		public static void main(String[] args) {
			keyword obj = new keyword();
		}
	}

