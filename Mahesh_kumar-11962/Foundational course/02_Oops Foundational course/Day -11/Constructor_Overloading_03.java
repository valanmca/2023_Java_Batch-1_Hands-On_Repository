package com.mahesh.Oops_day11;

class MYCLASS
{int num;
	MYCLASS()
	{
		this(6);
	}
	MYCLASS(int num)
	{
		this.num = num;
		this.fact();
	}
	
	void fact()
	{
		int fact =1;
		for(int i=1;i<num;i++)
		{
			fact =fact*i;
		}
		System.out.println("Factorial :"+fact);
	}
}
public class Constructor_Overloading_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MYCLASS OB = new MYCLASS();
		
	}

}
