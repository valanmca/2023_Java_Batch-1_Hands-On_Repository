package com.gayathri.day11;

public class ThisUsage {
	int n;
	
	ThisUsage(){
		this(10);
	}

	ThisUsage(int n){
		this.n = n;
		this.factorial();
	}
	
	void factorial()
	{
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
	public static void main(String[] args) {
		ThisUsage obj = new ThisUsage(); 
		
	}

}
