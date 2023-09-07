//Abstaction Class
//Using Inheritance and Polymorphism Method Over Ridings
package com.pravinkumar.day14;
class Shape
{
	
	void area()
	{
		System.out.println("Can not we find the area ");
	}
}


class Rectangle extends Shape
{
	void area()
	{
		System.out.println("We can find the area through (L*B) ");
	}
}



class Circle extends Shape
{
	void area()
	{
		System.out.println("We can find the area through (3.14*r^2)");
	}
}
public class Polymorphism_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
