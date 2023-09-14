package com.aravind.day10;
class a
{
	int lenth;
	int beadth;
	void area(int length,int breadth)
	{
		System.out.println(length*breadth);
	}
}
class b extends a
{
	
	void hai()
	
	{
		super.area(2, 2);
		System.out.println("ahai");
	}
	
}

public class Practise2 {

	public static void main(String[] args) {
		//a obj=new a();
		//obj.area(2, 2);
		b obj=new b();
	//	obj.area(2, 2);
		obj.hai();
		
		

	}

}
