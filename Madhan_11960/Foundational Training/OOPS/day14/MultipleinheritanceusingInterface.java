package com.madhan.day14;

interface One
{
	int a=10; //In interface,the default variables are public,static,final
}
interface Two
{
	int a=20;
}
interface Three extends One,Two
{
	void addition();   //Default methods are public,abstract in interface
}

class Add implements Three
{
	public void addition()
	{
		System.out.println("Addition:" +(One.a + Two.a)); //because of ambiguity ,we used class name.variable name
	}
}
public class MultipleinheritanceusingInterface {

	public static void main(String[] args) {
		Add a=new Add();
		a.addition();

	}

}
