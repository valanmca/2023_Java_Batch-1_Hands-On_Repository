package revision.oops;

class Animal{
	public void makesound() {
		System.out.println("Every Animal makes different sound");
	}
}
class Cat extends Animal{
	public void makesound() {
		System.out.println("Sounds like meow");
	}
}

class Dog extends Animal{
	public void makesound() {
		System.out.println("It barks");
	}
}


public class Overriding1 {

	public static void main(String[] args) {
		
		//Animal obj=new Cat();
		//obj.makesound();//Dynamic method Dispatch
		
		Cat cat=new Cat();
		cat.makesound();
		
		Dog dog=new Dog();
		dog.makesound();
		
  	}

}
