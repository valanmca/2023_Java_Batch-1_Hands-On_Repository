package com.gayathri.day17Java17Features;

record Trainee(int id, String name) {
	public Trainee {
		if (id < 100 || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid data");
		}
	}
}

public class P4CompactConstructor {

	public static void main(String[] args) {
		Trainee emp1 = new Trainee(101, "Gayathri");
		System.out.println(emp1);
		Trainee emp2 = new Trainee(102, "Devi");
		System.out.println(emp2);

	}

}
