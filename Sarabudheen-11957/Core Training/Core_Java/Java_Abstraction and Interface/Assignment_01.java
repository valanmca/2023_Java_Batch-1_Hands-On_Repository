/**** Java program to create and implementing the playable interface ****/
package com.sara.CoreJava.Day_07;

interface playable {

	void play();
}

class Football implements playable {

	public void play() {
		System.out.println("Play Football");
	}
}

class Volleyball implements playable {

	public void play() {
		System.out.println("Play Volleyball");
	}
}

class Basketball implements playable {

	public void play() {
		System.out.println("Play Basketball");
	}
}

public class Assignment_01 {

	public static void main(String[] args) {

		Football fb = new Football();
		fb.play();

		Volleyball vb = new Volleyball();
		vb.play();

		Basketball bb = new Basketball();
		bb.play();
	}

}
