//Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. 
//Create three classes Football, Volleyball, and Basketball that implement the Playable interface 
//and override the play() method to play the respective sports.

package com.dharshu.day6;

interface playable {
	void play();
}

class Football implements playable{
	public void play() {
		System.out.println("We play Football");
	}
}

class Vollyball implements playable{
	public void play() {
		System.out.println("We play Vollyball");
	}
}

class Basketball implements playable{
	public void play() {
		System.out.println("We play Basketball");
	}
}

public class Ex_01_Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playable foot=new Football();
		foot.play();
		playable volly=new Vollyball();
		volly.play();
		playable basket=new Basketball();
		basket.play();
	}

}
