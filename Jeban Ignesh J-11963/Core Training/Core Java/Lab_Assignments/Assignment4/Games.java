package com.jeban.Assignment4;

interface Playable{
	void play();
	
}
class Football implements Playable{
	public void play() {
		System.out.println("Play Footbal");
	}
}
class Volleyball implements Playable{
	public void play() {
		System.out.println("Play Volleyball");
	}
}
class Basketball implements Playable{
	public void play() {
		System.out.println("Play Basket ball");
	}
}

public class Games {

	public static void main(String[] args) {
		Football P=new Football();
		P.play();
		Volleyball P1=new Volleyball();
		P1.play();
		Basketball P2=new Basketball();
		P2.play();
		
		
		

	}

}
