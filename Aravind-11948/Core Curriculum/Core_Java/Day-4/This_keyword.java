package com.core.day_04;

public class This_keyword {
	int a =10;
	
	This_keyword()
	{ this(10);
	
		System.out.println("A"+this.a);
	}
	
	This_keyword(int a)
	{
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		This_keyword obj=new This_keyword();

	}

}
