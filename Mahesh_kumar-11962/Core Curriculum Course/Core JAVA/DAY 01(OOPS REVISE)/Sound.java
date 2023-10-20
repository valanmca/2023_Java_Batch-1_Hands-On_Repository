package com.mahesh.core_java;

abstract class Animal_sound
{
	abstract void makesound();
}

class Tiger extends Animal_sound
{
	 void makesound()
	 {
		 System.out.println("Tiger growl");
	 }
}

class Lion extends Animal
{
	 void makesound()
	 {
		 System.out.println("Lion Roar");
	 }
}


public class Sound {

	public static void main(String[] args) {
	
		Lion noise = new Lion();
		noise.makesound();

	}

}
