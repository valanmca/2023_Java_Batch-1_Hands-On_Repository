package com.core.sealed;

record Person(int empid,String empname) {}

public class RecordClass {

	public static void main(String[] args) {
		
		Person p1= new Person(21,"Peter Parker");
		System.out.println("Age:"+p1.empid());
		System.out.println("Name:"+p1.empname());
		System.out.println(p1.toString());
		System.out.println("Hashcode for FirstObject:"+p1.hashCode());
		
		
		Person p2= new Person(21,"Muthuraj");
		System.out.println("Age:"+p2.empid());
		System.out.println("Name:"+p2.empname());
		System.out.println(p2.toString());
		System.out.println("Hashcode for SecondObject:"+p2.hashCode());
		
		System.out.println("p1,p2 is Equal:"+p1.equals(p2));
	}

}
