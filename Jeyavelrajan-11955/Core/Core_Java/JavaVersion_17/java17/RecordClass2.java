package com.jeyavel.core.java17;

record Trainee(int id,String name) {
	public Trainee{
		if(id<100||name.isEmpty()) {
			throw new IllegalArgumentException("Invalid Data");
		}
	}
}


public class RecordClass2 {

	public static void main(String[] args) {
		Trainee emp1 = new Trainee(101,"jeyavel");
		System.out.println(emp1);
		Trainee emp2 = new Trainee(102,"Mahesh");
		System.out.println(emp2);
	}

}
