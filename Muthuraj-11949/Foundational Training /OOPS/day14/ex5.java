package com.muthu.day14;
interface AnimalPlan{
	void eat();
	void food();
	void move();
	void wayofMove();	
}
abstract class Animal implements AnimalPlan{
	public void eat() {
		System.out.println("i wil eat");
	}
	abstract public void food();//not define
	
	public void move() {
		System.out.println("all move");
	}
	abstract public void wayofMove();
}
class dog extends Animal{
	public void food() {
		System.out.println("chicken");
	}
	public void wayofMove() {
		System.out.println("by walking the four leg");
	}
}
class brids extends dog{
	public void food() {
		System.out.println("seed");
	}
	public void wayofmove() {
		System.out.println("by walking the two leg");
		
	}
}
class fish extends brids{
	public void food() {
		System.out.println("rice");
	}
	public void wayofmove() {
		System.out.println("swim");
		
	}
	
}

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog dog=new dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayofMove();
		brids brids=new brids();
		brids.eat();
		brids.food();
		brids.move();
		brids.wayofMove();
		fish fish=new fish();
		fish.eat();
		fish.food();
		fish.move();
		fish.wayofMove();
		

	}

}
