package com.jeban.oops;

abstract class Animalss{
	abstract public void Sound();
}
class Lion extends Animalss{
	public void Sound() {
		System.out.println("Lion Speakes Roar");
	}
}
class Tiger extends Animalss{
	public void Sound() {
		System.out.println("Tiger Speakes Growm");
	}
}

public class Program4 {

	public static void main(String[] args) {
		Animalss obj=new Lion();
		obj.Sound();
		Animalss obj1=new Tiger();
		obj1.Sound();
		
		
	}

}
