
//write a java program to create an interface playable with a method play() that takes no arguments and returns void. Create three classes 
//football,volleyball,and basketball that implement the playable interface and override the play() method to play the respective sports.

package com.shiva.core.day06;

interface Playable {
	void play();
}

class Football implements Playable {
	public void play() {
		System.out.println("Play Football");
	}
}

class Volleyball implements Playable {
	public void play() {
		System.out.println("Play Volleyball");
	}
}

class Basketball implements Playable {
	public void play() {
		System.out.println("Play Basketball");
	}
}

public class Assign_01 {

	public static void main(String[] args) {
		Football obj = new Football();
		Volleyball obj1 = new Volleyball();
		Basketball obj2 = new Basketball();
		obj.play();
		obj1.play();
		obj2.play();

	}

}
