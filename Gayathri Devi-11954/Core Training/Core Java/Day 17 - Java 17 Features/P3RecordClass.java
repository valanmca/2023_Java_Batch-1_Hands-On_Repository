package com.gayathri.day17Java17Features;

record Person(int age, String name) { }//no need to create class, constructor, return methods
//reduce code
//we can able to write a method, pass the arguments
//this is private final class

public class P3RecordClass {

	public static void main(String[] args) {
		
		Person p1 = new Person(22, "Gayathri");
		System.out.println("Age : "+p1.age());
		System.out.println("Name : "+p1.name());
		System.out.println(p1.toString());
		System.out.println("Hadhcode for First object : "+p1.hashCode());
		
		Person p2 = new Person(15,"Devi");
		System.out.println("Age : "+p2.age());
		System.out.println("Name : "+p2.name());
		System.out.println(p2.toString());
		System.out.println("Hashcode for secod object : "+p2.hashCode());
		
		System.out.println("p1,p2 is equal ? :"+p1.equals(p2));
	}

}
