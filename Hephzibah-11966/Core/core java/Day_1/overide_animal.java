package oops_1;

class Animal{
	public void makesound() {
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animal{
	public void makesound() {
		System.out.println("cat sounds Meow");
	}
}
public class overide_animal {
        public static void main(String[] args) {
		Cat cat=new Cat();
		cat.makesound();
		
		Animal animal=new Animal();
		animal.makesound();
	}

}
