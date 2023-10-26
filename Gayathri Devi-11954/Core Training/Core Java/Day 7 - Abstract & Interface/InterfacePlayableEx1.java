package com.gayathri.day6;

/*
 * Write a java program to create an interface playable with method play() that takes no arguments and returns void.
 * create three classes football, volleyball and basket ball that implement that playable interface and override that 
 * play() method to play the respective sports. 
 */
interface Playable {
	void play();
}

class FootBall implements Playable {
	public void play() {
		System.out.println("I can play Football.");
	}
}

class VolleyBall implements Playable {
	public void play() {
		System.out.println("I can play Volleyball.");
	}
}

class BasketBall implements Playable {
	public void play() {
		System.out.println("I can play Basketball.");
	}
}

public class InterfacePlayableEx1 {

	public static void main(String[] args) {

		Playable reference1 = new FootBall();
		reference1.play();
		
		Playable reference2 = new VolleyBall();
		reference2.play();
		
		Playable reference3 = new BasketBall();
		reference3.play();
		
	}

}
