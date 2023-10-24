package com.gayathri.day1;

abstract class AnimalAbs {
	public abstract void sound();
}

class Lion extends AnimalAbs{
	public void sound() {
		System.out.println("Lion make sound as ROAR");
	}
}
class Tiger extends AnimalAbs{
	public void sound() {
		System.out.println("Tiger make sound as Growl");
	}
}
public class AbstractClassEx4 {

	public static void main(String[] args) {

		AnimalAbs reference = new Lion();
		reference.sound();
		

		AnimalAbs ref = new Tiger();
		ref.sound();
		
	}

}
