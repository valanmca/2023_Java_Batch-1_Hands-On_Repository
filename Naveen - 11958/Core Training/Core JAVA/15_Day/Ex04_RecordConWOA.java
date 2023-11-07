package com.naveen.day_15;

//Record Class Constructor without arguments
record Trainee (int id, String name) {
	 public Trainee {
		if (id < 100 || name.isEmpty()) {
		 throw new IllegalArgumentException("Invalid data");
		}
	 } }

public class Ex04_RecordConWOA {

	public static void main(String[] args) {
		Trainee emp1 = new Trainee(101, "Naveen");
		 System.out.println(emp1);
		 Trainee emp2 = new Trainee(500, "Raj");
		 System.out.println(emp2);

	}

}
