package com.swetha.day14;


interface AnimalBehaviour{
	void food();
	void eat();
	void move();
	void wayOfMove();
	
}
abstract class Animal implements AnimalBehaviour{
	public void eat() {                              //common functionality for all animals
		System.out.print("All animals eat, ");
	}
	public abstract void food(); //change based on animal
	
    public void move() {                             //common functionality for all animals

		System.out.print("I can move, ");
	}
	public abstract void wayOfMove();   //change based on animal
	
}
class Dog extends Animal{
	public void food() {
		System.out.println("Dog eat chicken");
	}
	public void wayOfMove() {
		System.out.println("By walk");
	}
}
class  Bird extends Animal{
	public void food() {
		System.out.println("Bird eats nuts");
	}
	public void wayOfMove() {
		System.out.println("By fly");
	}
	
}
public class AnimalEx6 {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.food();
		obj.move();
        obj.wayOfMove();
        
        Bird obj1=new Bird();
        obj1.eat();
		obj1.food();
		obj1.move();
        obj1.wayOfMove();
   }

}
