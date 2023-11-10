package com.madhan.java17;

record Trainee (int id, String name)
	{
	//constructor without arguments(Compact Constructor)//
	public Trainee {
		if (id < 100 || name.isEmpty()) {
		 throw new IllegalArgumentException("Invalid data");
		}
	 } }

	public class compactConstructor {
	 public static void main(String[] args) {
	 Trainee emp1 = new Trainee(101, "sara");
	 System.out.println(emp1);
	 Trainee emp2 = new Trainee(50, "sankar");
	 System.out.println(emp2);
	 }
	 }




