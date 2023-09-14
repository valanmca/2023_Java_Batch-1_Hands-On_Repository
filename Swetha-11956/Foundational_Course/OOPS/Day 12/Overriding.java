package Practice1;



class Animal{
	public void eat(){
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dogs eat chicken");
	}
	
}

public class Overriding {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();

	}

}
