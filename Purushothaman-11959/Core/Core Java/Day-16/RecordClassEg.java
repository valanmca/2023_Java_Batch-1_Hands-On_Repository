package com.purushoth.day_16;

record Person(int age, String name) {}

public class RecordClassEg {

	public static void main(String[] args) {
		Person p1=new Person(22,"Andrew garfield");
		System.out.println("Age: "+p1.age());
		System.out.println("Name: "+p1.name());
		System.out.println(p1.toString());
		System.out.println("HashCode: "+p1.hashCode());
		
		Person p2=new Person(24,"Tom holland");
		System.out.println("p1,p2 is Equal: "+p1.equals(p2));

	}

}
