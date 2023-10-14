package com.dharshu.OopsRecap;

abstract class Animalsound{
	abstract public void sound();

}
class Lion extends Animalsound{
	public void sound() {
	
	System.out.println("Lion Roar");
	}
}
class Tiger extends Animalsound{
	public void sound() {
		System.out.println("Tiger Roar");
	}
}
public class AnimalAbstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animalsound lion = new Lion(); 
		lion.sound();
		
		Animalsound tiger = new Tiger();
		tiger.sound();
		
		Lion lion1 = new Lion();
		lion1.sound();
		
		Tiger tiger1 = new Tiger();
		tiger1.sound();
	}

}
