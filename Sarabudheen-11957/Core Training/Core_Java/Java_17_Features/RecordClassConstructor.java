//Example for Record Class Constructor without arguments
package com.sara.CoreJava.Day_17;

//Record Class Constructor without arguments
record Trainee(int id, String name) {
	public Trainee {
		if (id < 100 || name.isEmpty()) {
			throw new IllegalArgumentException("Invalid data");
		}
	}
}

public class RecordClassConstructor {

	public static void main(String[] args) {
		Trainee emp1 = new Trainee(101, "Sara");
		System.out.println(emp1);
		
		Trainee emp2 = new Trainee(500, "Virat");
		System.out.println(emp2);
	}

}
