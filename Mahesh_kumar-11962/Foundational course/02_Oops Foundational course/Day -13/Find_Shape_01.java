package com.mahesh.Oops_day13;

abstract class Shape_01{
	
	abstract void area();
	
	// abstract void method(); method() can only decluration, no defination in this code.
	// abstract class contain abstract and non abstract properties.
	// we can't create the object for abstract class
	// abstract be a super class so we access by using super();
	
	//abstract class is a parcially completed class.
	
	abstract void function();
	
	void concreate_method()
	{
		System.out.println("We can run the normal method into the abstract class");
	}
	
}
class Rectangle_01 extends Shape_01
{
	
	void area()
	{
		
		System.out.println("Area for Rectangle : (l*b)");
		
	}
	
	void function()
	{
		System.out.println("function_ 01 runs from Rectangle_01 class");
		
	}
}
class Circle_01 extends Shape_01
{
	
	void area()
	{
	
		System.out.println(" Area for Circle : ( Math.PI*(r*r) )");
	}
	
	void function()
	{
	System.out.println(" fun");
	}
}


public class Find_Shape_01 {

	public static void main(String[] args) {
		
		Shape_01 sh_obj  = new Rectangle_01(); //DMD
		//abstarct method only override.
		sh_obj.area(); 
		
		//concreate method is not override buz, object can only override not reference.
		sh_obj.concreate_method();
		
		sh_obj.function();
	}

}

