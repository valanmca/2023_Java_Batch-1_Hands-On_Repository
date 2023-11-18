//Example for Record Classes
package com.sara.CoreJava.Day_17;

record Person(int age, String name) {

}

public class RecordClass {

	public static void main(String[] args) {

		Person p1 = new Person(21, "Sara");
		System.out.println("Age :" + p1.age());
		System.out.println("Name :" + p1.name());
		System.out.println(p1.toString());
		System.out.println("Hashcode for FirstObject :" + p1.hashCode());

		Person p2 = new Person(35, "Virat Kohli");
		System.out.println("Age :" + p2.age());
		System.out.println("Name :" + p2.name());
		System.out.println(p2.toString());
		System.out.println("Hashcode for SecondObject :" + p2.hashCode());
		
		System.out.println("p1,p2 is Equal :" + p1.equals(p2));
	}

}
