package com.swetha.day9;

public class Operations {
	
	void factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
	}
		System.out.println("The factorial is : "+fact);
		
	}
	static void digitCount(int n) {
		
			int count = 0;
			while(n!=0) {
				n=n/10;
				count++;
			
	}
		System.out.println("The count of digit  is : "+count);
	}

	public static void main(String[] args) {
		Operations obj=new Operations();
		obj.factorial(5);
		
		Operations.digitCount(823);
		

	}

}
