package com.swetha.features;
//Compact constructor.

record Trainee(int id,String name) {
	public Trainee{
		if(id<100|| name.isEmpty()) {
			throw new IllegalArgumentException("Invalid data");
		}
	}
}

public class CompactConstructor {

	
	public static void main(String[] args) {
		Trainee emp1=new Trainee(101,"swe");
		System.out.println(emp1);
		Trainee emp2=new Trainee(104,"Arun");
		System.out.println(emp2);
		
		
	}

}
