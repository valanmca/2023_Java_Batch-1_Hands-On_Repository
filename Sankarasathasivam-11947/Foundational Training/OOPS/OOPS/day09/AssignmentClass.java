package com.shiva.day09;

public class AssignmentClass {
	
	void factorial(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	static void digitCount(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		AssignmentClass obj=new AssignmentClass();
		obj.factorial(5);
		
//		AssignmentClass obj1=new AssignmentClass();
		obj.digitCount(2389);
	}

}
