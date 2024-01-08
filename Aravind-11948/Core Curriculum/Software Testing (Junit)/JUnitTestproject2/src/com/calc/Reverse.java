package com.calc;

public class Reverse {
	
	public int getReverse(int a) {
		
		int num=a;
		int rem;
		int rev=0;
		
		while (num!=0) {
			rem=num%10;
			rev=rev *10 +rem;
			num=num/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		Reverse obj=new Reverse();
		
		int Reverse=obj.getReverse(1234);
		System.out.println(Reverse);
		
			
	}
}
