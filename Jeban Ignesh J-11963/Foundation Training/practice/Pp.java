package com.jeban.practice;

abstract class op{
	public static void sum()
	{
		System.out.println("A method");
	}
}

class Pp extends op {
	public static void sum()
	{
		System.out.println("B method");
	}
	
	
	
	public static void main(String[] args) {
	
		op ob1=new Pp();//
		ob1.sum();
		
		
		}

}
