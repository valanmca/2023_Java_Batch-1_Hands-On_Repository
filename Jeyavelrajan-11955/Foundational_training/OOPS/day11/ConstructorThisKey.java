package com.jeyavel.OOPS.day11;

public class ConstructorThisKey {
	int n;
	ConstructorThisKey(){
		//we Must use keyword (this) and (super) that must be in the first line in constructor
		this(5);
	}
	ConstructorThisKey (int n){
		this.n=n;
		this.findFactorial();
		
		
	}
	public void findFactorial(){
		int fact=1;
		for(int i=1;i<n;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial->"+fact);
	}
	
   //Static   it can run without object/using class it will Execute 
	//this    it cannot run without object
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConstructorThisKey thiskey =new ConstructorThisKey();
//		thiskey.findFactorial();
		

	}

}
