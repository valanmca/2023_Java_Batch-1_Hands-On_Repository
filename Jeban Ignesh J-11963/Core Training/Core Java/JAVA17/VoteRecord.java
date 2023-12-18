package com.jeban.JAVA17;

record Trainee(int id,String name){
	public Trainee{
		if(id<100||name.isEmpty()) {
			throw new IllegalArgumentException("Invalid Data");
		}
	}
}

public class VoteRecord {

	public static void main(String[] args) {
		Trainee emp1=new Trainee(101,"Sara");
		System.out.println(emp1);
		Trainee emp2=new Trainee(102,"Domnic");
		System.out.println(emp2);

	}

}
