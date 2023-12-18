package com.jeban.JAVA17;

record Person(int age,String name) {
	
}

public class HumanRecord {

	public static void main(String[] args) {
	Person p1=new Person(23,"Peter");
	System.out.println("Age:"+p1.age());
	System.out.println("Name:"+p1.name());
	System.out.println(p1.toString());
	System.out.println("Hashcode for FirstObject:"+p1.hashCode());
	System.out.println("------------------------------------------");
	Person p2=new Person(23,"Jeban");
	System.out.println("Age:"+p1.age());
	System.out.println("Name:"+p1.name());
	System.out.println(p1.toString());
	System.out.println("Hashcode for FirstObject:"+p1.hashCode());
	System.out.println("p1,p2 is equal:"+p1.equals(p2));


	}

}
