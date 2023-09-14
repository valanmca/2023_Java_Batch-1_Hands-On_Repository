package com.dharshu.day11;

public class ThisUsage {
 
	int n;
	
	ThisUsage(){
		this(5);
	}
	
	ThisUsage(int n){
		this.n=n;
		this.findFactorial();
	}
	public void findFactorial() {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of " + n + "is:" +fact);
	}



	public static void main(String[] args) {
		ThisUsage use=new ThisUsage();
		//this.findFactorial();

	}

}
