package com.jeyandhan.day07;
//assignment 1

interface Playable{
	void play();
}

class FootBall implements Playable{
	public void play() {
		System.out.println("FootBall");
	}
}

class VolleyBall implements Playable{
	public void play() {
		System.out.println("VolleyBall");
	}
}

class BasketBall implements Playable{
	public void play() {
		System.out.println("BasketBall");
	}
}

public class Sports {

	public static void main(String[] args) {
		
		FootBall foot = new FootBall();
		VolleyBall volley  = new VolleyBall();
		BasketBall basket = new BasketBall();
		
		foot.play();
		volley.play();
		basket.play();
	}

}
