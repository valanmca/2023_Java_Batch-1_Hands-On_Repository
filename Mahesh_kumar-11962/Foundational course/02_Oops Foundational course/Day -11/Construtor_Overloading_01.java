package com.mahesh.Oops_day11;

class action
{
	
	
	 action(String name)
	{
		 this(5);
		 System.out.println("Hello! "+name);
		
	}
	
	action(int num)
	{
		
		this(44,66);
		int fact =1;
		for(int i =1;i<num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial value is:"+fact);
		
	}
	
	 action(int val_1,int val_2)
	{
		
		int add = val_1+val_2;
		System.out.println("ADD :"+add);
	}
	
}
public class Construtor_Overloading_01 {

	public static void main(String[] args) {
		
		action obj = new action("Mahesh");
		//action obj1 = new action(6);
		//action obj2 = new action(3,5);
		

	}

}
