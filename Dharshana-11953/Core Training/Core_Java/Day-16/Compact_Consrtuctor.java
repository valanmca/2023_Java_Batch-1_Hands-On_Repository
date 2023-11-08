package com.dharshu.day16;

record Trainee (int id, String name) {
	 public Trainee {
		if (id < 100 || name.isEmpty()) {
		 throw new IllegalArgumentException("Invalid data");
		}
	 } }

public class Compact_Consrtuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainee emp1 = new Trainee(101, "Dharshu");
		 System.out.println(emp1);
		 Trainee emp2 = new Trainee(50, "Minion");
		 System.out.println(emp2);
		 

	}

}
