package com.jenish.day6;
interface Playable {
	void play();
}
class Football implements Playable {
	public void play() {
		System.out.println("I am Playing Football");
	}
}
class Volleyball implements Playable {
	public void play() {
		System.out.println("I am Playing Volleyball");
	}
}
class Basketball implements Playable {
	public void play() {
		System.out.println("I am Playing Basketball");
	}
}
public class Ex_01_Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable football = new Football();
		football.play();
		Playable volleyball = new Volleyball();
		volleyball.play();
		Playable basketball = new Basketball();
		basketball.play();
		
	}

}
