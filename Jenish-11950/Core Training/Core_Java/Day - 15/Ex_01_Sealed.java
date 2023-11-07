package com.jenish.day15;

sealed class SuperClass1 permits subclass1, subclass2, addition{
	//Sealed Super class
}
final class subclass1 extends SuperClass1 //using final keywords
{
	
}
non-sealed class subclass2 extends SuperClass1 //using non sealed keyword
{
	
}
sealed class addition extends SuperClass1 permits subtraction {
	
}
final class subtraction extends addition{
	
}

public class Ex_01_Sealed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
