package com.mahesh.core_java_day_07;

interface one
{
	void add(int a, int b);
}

interface two {
	void subract(int a,int b);
}

class calculate implements one,two
{
	public void add(int a,int b)
	{
		System.out.println("Addition : "+(a+b));
	}
	
	public void subract(int a,int b)
	{
		System.out.println("Subraction : "+(a-b));
	}
}
//------------------> 1
 interface three
 {
	int a =20;
	 
 }
//------------------> 2
 interface four
 {
	int b = 30;
	 
 }
//------------------ multiple inheritance
 interface disp extends three,four
 {
	 void sum();
	 
 }
 
 class show implements disp
 {
	 public void sum()
	 {
		 System.out.println("Add 2 val : "+(three.a+four.b));
	 }
 }
public class Multiple_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculate cal = new calculate();
		cal.add(4, 5);
		cal.subract(89, 11);
		//---Multiple inheritance--//
		show view = new show();
		view.sum();
		
		
		

	}

}
