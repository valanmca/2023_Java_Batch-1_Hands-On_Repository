package com.purushoth.day_04;

class Sports{
	void play() {
		System.out.println("Every sports needs physical strength to play");
	}
}

class Football extends Sports{
	void play() {
		System.out.println("Kick using foot into the goalpost to score");
	}
}

class Basketball extends Sports{
	void play() {
		System.out.println("Tap the ball and put in the basket to score");
	}
}

class Rugby extends Sports{
	void play() {
		System.out.println("Need to carry the ball outside the line to score");
	}
}
public class SportsClass {

	public static void main(String[] args) {
		Sports obj=new Football();
		obj.play();
		Sports obj1=new Basketball();
		obj1.play();
		Sports obj2=new Rugby();
		obj2.play();

	}

}
