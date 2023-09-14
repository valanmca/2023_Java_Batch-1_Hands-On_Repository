package com.mahesh.Oops_day11;
class SuperClass
{
int a;
SuperClass(int a)
{
	this.a=a;
}
void display()
{
	System.out.println("Value of A is : "+a);
}
}
class Subclass extends SuperClass
{
	Subclass()
	{
		super(10);
		super.display();
		System.out.println("Value of A :"+super.a);
	}
}
public class Super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass Subobj = new Subclass();
		
	}

}
