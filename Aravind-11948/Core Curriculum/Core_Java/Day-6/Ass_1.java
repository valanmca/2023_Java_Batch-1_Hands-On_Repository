package com.core.day_06;

interface Playable {
	void play();
}

class FootBall implements Playable {
	public void play() {
		System.out.println("Play football");
	}
}

class VolleyBall implements Playable {
	public void play() {
		System.out.println("Play volleyball");
	}
}

class BasketBall implements Playable {
	public void play() {
		System.out.println("Play basketball");
	}
}

public class Ass_1 {

	public static void main(String[] args) {

		FootBall obj = new FootBall();
		VolleyBall obj1 = new VolleyBall();
		BasketBall obj2 = new BasketBall();
		obj.play();
		obj1.play();
		obj2.play();

	}

}
