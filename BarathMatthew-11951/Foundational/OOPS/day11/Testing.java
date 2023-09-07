package com.matthew.day11;

public class Testing {
	int n;
	
	Testing() {
		this(5);
	}
	
	Testing(int n){
		this.n = n;
		this.findFactorial();
	}
	
	public void findFactorial() {
		int fact =1;
		for (int i = 2;i<n;i++) {
			fact*=i;
		}
		System.out.println("Fact :"+fact);
	}
	
	public static void main(String[] args) {
		Testing test = new Testing();
		}

}

