package com.jeyavel.OOPS.day14;

//Multiple inheritance using Interfaces

interface one{
	int a=10;//public static final
}
interface two{
	int a=20;//public static final
}

interface three extends  one,two{//Multiple Inheritance
	void addition();//public Abstract
}
class ccalculator implements three{
	public void addition() {
		System.out.println("Multiple inheritance <-using-> Interface:");
		System.out.println("Addition: "+(one.a+two.a));//because of static we can call using (variable name)  
	}
}
public class ExerciseNo4 {

	public static void main(String[] args) {
		
		ccalculator inter =new ccalculator();
		inter.addition();

	}

}
