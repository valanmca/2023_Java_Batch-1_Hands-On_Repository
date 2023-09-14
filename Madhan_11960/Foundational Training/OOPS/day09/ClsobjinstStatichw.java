package com.madhan.day09;
import java.util.Scanner;

class Dog
{
	//Instance variable
	String colour;
	String breed;
	int price;
	
	//static variable
	static void sumofDigits(int n)
	{
		int digits;
		int sum=0;
		while(n!=0)
		{
			digits=n%10;
			sum=sum+digits;
			n=n/10;
		}
		System.out.println(sum);
	}
	
	//constructor
	Dog(String colour,String breed,int price)
	{
		this.colour=colour;
		this.breed=breed;
		this.price=price;
	}
	
	//To display 
	void display()
	{
		System.out.println("Colour of dog:" +colour);
		System.out.println("Breed :" +breed);
		System.out.println("Price :" +price);
		
	}
}

public class ClsobjinstStatichw {
	
//	static void sumofDigits(int n)
//	{
//		int digits;
//		int sum=0;
//		while(n!=0)
//		{
//			digits=n%10;
//			sum=sum+digits;
//			n=n/10;
//		}
//		System.out.println(sum);
//	}

	public static void main(String[] args) {
		
		Dog obj1=new Dog("Brown","Labrador",10000);
		obj1.display();
		Dog obj2=new Dog("White","Pug",5000);
		obj2.display();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int value=sc.nextInt();
		
		Dog.sumofDigits(value);
		
		
		

	}

}
