package com.shiva.day11;

class MyConcatination
{
	void concat(int a,int b)
	{
		System.out.println("The Value : "+a+b);
	}
	void concat(float a,float b)
	{
		System.out.println("The Float Value : "+a+b);
	}
	void concat(String a,String b)
	{
		System.out.println("The String Value : "+a+b);
	}
}

public class Assign1 {

	public static void main(String[] args) {
		
		MyConcatination obj=new MyConcatination();
		obj.concat(2, 2);
		
		MyConcatination obj1=new MyConcatination();
		obj1.concat(2.0f, 2.0f);
		
		MyConcatination obj2=new MyConcatination();
		obj2.concat("Shiv", "a");

	}

}
