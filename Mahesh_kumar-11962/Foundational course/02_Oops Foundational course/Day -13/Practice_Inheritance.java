package com.mahesh.Oops_day13;


class Animal_01

{
	int a =10;
	
	 public void eat()
	{
		System.out.println("All Animals can eat");
	}
}
class Dogs extends Animal_01
{	int a =20;
	int b =getBvalue();
	public void eat()
	{
	System.out.println("Dog can eat Chicken");
	}
	
	int getBvalue()
	{   b =20;
		return b;
		
	}
	
}


	
	public class Practice_Inheritance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			final int a =10;
			// a=20; can't be modify it's fixed value.
			//if any method changed into final we cann't override 
			Dogs dog= new Dogs();
			dog.eat(); //Dog can eat Chicken
			
			Animal_01 animal= new Dogs();      //Dynamic Method Dispath [DMD] 
			animal.eat(); //Dog can eat Chicken
			
			/*
			Dogs dog_obj= new Animal_01();
			dog_obj.eat();
			*/

			System.out.println(animal.a); //object can only override & variables cannot be override.
			System.out.println(dog.b); //by using we can override the variable using method.
			
			
			//we can't ovrride the constractor bcz, Super class name is different and subclass name is also different.
			
			
			
		}

	}


