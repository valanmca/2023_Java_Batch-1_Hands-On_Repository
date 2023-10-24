package com.purushoth.day_05;

interface Playable {
	void play();
}

class Football implements Playable {
	public void play() {
		System.out.println("Need to use foot");
	}
}

class Volleyball implements Playable {
	public void play() {
		System.out.println("Need to use hand");
	}
}

class Basketball implements Playable {
	public void play() {
		System.out.println("Need to use hand and to put in basket");
	}
}
public class Sports {

	public static void main(String[] args) {
          Football obj=new Football();
          obj.play();
          Volleyball obj1=new Volleyball();
          obj1.play();
          Basketball obj2=new Basketball();
          obj2.play();
	}

}
