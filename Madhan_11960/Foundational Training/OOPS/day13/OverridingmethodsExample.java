package com.madhan.day13;

class Animal
{
	String s=getValue();
	 private String getValue()  
	{
		return "A";
	}
}

class Dog extends Animal
{
       public String getValue() /*subclass specifier should be equal or higher than
                                    superclass access specifier*/
       {                              
        	return "B";
        }
        
}
public class OverridingmethodsExample {

	public static void main(String[] args) {
		Dog d=new Dog();
		System.out.println(d.s);
		Animal ani=new Dog();
		System.out.println(ani.s);

	}

}
