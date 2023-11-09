package com.jeyavel.core.java17;


record Person(int EmpId,String Empname) {}
//All methods are build in the record class

public class RecordClass {

	public static void main(String[] args) {
		
		Person p1 = new Person(21,"Peter Parker ");
		System.out.println("Age:"+p1.EmpId());
		System.out.println("Name:"+p1.Empname());
		System.out.println(p1.toString());
		System.out.println("Hashcode for the First Object"+p1.hashCode());
		
		Person p2 = new Person(16,"Miles Morales");
		System.out.println("Age:"+p2.EmpId());
		System.out.println("Name:"+p2.Empname());
		System.out.println(p2.toString());
		System.out.println("Hashcode for the Second Object"+p2.hashCode());
	}

}
