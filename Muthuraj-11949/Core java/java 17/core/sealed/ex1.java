package com.core.sealed;

record Trainee (int id,String name) {
	public Trainee{
		if(id>100 || name.isEmpty()) ///> 200 
		{
			throw new IllegalArgumentException("Invalid data");		
		}
	}
}
public class ex1 {
	public static void main(String[] args) {
		Trainee emp1 =new Trainee(100,"jeban");
		System.out.println(emp1);
		Trainee emp2=new Trainee(50,"Muthu");
		System.out.println(emp2);
	}
}
