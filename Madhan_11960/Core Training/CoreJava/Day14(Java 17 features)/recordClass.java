package com.madhan.java17;

record Person(int empId, String empName) { }

public class recordClass {
	public static void main(String[] args) {

		Person p1 = new Person(21, "Madhan kumar");
		System.out.println("Age :" + p1.empId());
		System.out.println("Name :" + p1.empName());
		System.out.println(p1.toString());
		System.out.println("Hashcode for FirstObject :" + p1.hashCode());

		Person p2 = new Person(16, "Jeya Suriya");
		System.out.println("Age :" + p2.empId());
		System.out.println("Name :" + p2.empName());
		System.out.println(p2.toString());
		System.out.println("Hashcode for SecondObject :" + p2.hashCode());
		System.out.println("p1,p2 is Equal :" + p1.equals(p2));
	} 
}




