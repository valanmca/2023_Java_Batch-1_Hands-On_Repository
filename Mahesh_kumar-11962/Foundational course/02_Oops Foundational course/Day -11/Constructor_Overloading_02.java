package com.mahesh.Oops_day11;
class Do_Actions
{
	
	
	Do_Actions(String name)
	{
		
		 System.out.println("Hello! "+name);
		
	}
	
	Do_Actions(int num)
	{
		
	
		int fact =1;
		for(int i =1;i<num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial value is:"+fact);
		
	}
	
	Do_Actions(int val_1,int val_2)
	{
		
		int add = val_1+val_2;
		System.out.println("ADD :"+add);
	}
}
public class Constructor_Overloading_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Do_Actions obj = new Do_Actions("Mahesh");
		Do_Actions obj1 = new Do_Actions(6);
		Do_Actions obj2 = new Do_Actions(3,5);
	}

}
