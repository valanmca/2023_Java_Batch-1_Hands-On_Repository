package com.swetha.day11;

public class ThisKeyword {
	int n;
	ThisKeyword(){
		this(5);
	}
	ThisKeyword(int n){
		this.n=n;
		this.findFactorial();
	}
	public void findFactorial() {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial is : "+fact);
	}
              
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword();

	}

}
