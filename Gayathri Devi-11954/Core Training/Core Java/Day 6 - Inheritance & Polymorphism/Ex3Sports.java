package com.gayathri.day5;

/*
 *   Write a Java program to create a base class Sports with a method called play(). 
 *   Create three subclasses: Football, Basketball, and Rugby. 
 *   Override the play() method in each subclass to play a specific statement for each sport.
 */
class Sports {
	public void play() {
		System.out.println("Sports");
	}

}
class FootBall extends Sports {
	public void play() {
		System.out.println("Foot Ball");
	}
}
class BasketBall extends Sports {
	public void play() {
		System.out.println("Basket Ball");
	}
}
class Rugby extends Sports {
	public void play() {
		System.out.println("Rubgby");
	}
}
public class Ex3Sports {

	public static void main(String[] args) {
		
	FootBall fb = new FootBall();
	fb.play();
	
	BasketBall bb = new BasketBall();
	bb.play();
	
	Rugby rb = new Rugby();
	rb.play();
	}

}
