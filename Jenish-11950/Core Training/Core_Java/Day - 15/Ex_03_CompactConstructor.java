package com.jenish.day15;

record Trainee (int id, String name) {
	public Trainee{
		if (id < 100 || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid data");
		}
	}
}

public class Ex_03_CompactConstructor {

	public static void main(String[] args) {
		Trainee emp1 = new Trainee(101, "sara");
		System.out.println(emp1);
		Trainee emp2 = new Trainee(50, "siva");
		System.out.println(emp2);

	}

}
