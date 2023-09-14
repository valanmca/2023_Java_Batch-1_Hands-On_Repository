package oops11;
class Animal1{
	public void eat() {
		System.out.println("all animals eat ");
	
	}
	public void speak() {
		System.out.println("All animals will make sound");
	}
}	
class Dog1 extends Animal1{
	public void eat() {
		System.out.println("Dog eat Chicken ");
	
	}
	public void speak() {
		System.out.println("Dog will Bark");
	}
}	
class Cat1 extends Animal1{
	public void eat() {
		System.out.println("cat eat Fish ");
	
	}
	public void speak() {
		System.out.println("meow");
	}
}	

public class poly9 {

	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.eat();
		dog.speak();
		
		Cat1 cat=new Cat1();
		cat.eat();
		cat.speak();

	}

}




