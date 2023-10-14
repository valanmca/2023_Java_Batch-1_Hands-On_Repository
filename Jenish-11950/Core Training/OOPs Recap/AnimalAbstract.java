package com.jenish.OopsRecap;

abstract class Animal1{
	abstract void sound();
	}
class Lion extends Animal1{
	void sound() {
		System.out.println("Lion Sound");
	}
}

class Tiger extends Animal1{
	void sound() {
		System.out.println("Tiger Sound");
	}
}
public class AnimalAbstract {

	public static void main(String[] args) {
		Animal1 obj=new Lion();
		obj.sound();
		
		Animal1 obj1=new Tiger();
		obj1.sound();

	}

}
