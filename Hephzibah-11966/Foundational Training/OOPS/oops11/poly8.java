package oops11;

//Over ridding 
//compile time polymorphism

class Animal{
	public void eat() {
		System.out.println("all animals eat ");
	
	}
}	
class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat Chicken ");
	
	}
}	
class Cat extends Animal{
	public void eat() {
		System.out.println("cat eat Fish ");
	
	}
}	

public class poly8 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		
		Cat cat=new Cat();
		cat.eat();

	}

}
