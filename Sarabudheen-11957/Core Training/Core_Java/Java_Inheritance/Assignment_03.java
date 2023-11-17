package com.sara.CoreJava.Day_06;

class Sports{
	
	void play() {
		
	}
}

class Football extends Sports{
	void play() {
		System.out.println("Play a football");
	}
}

class Basketball extends Sports{
	void play() {
		System.out.println("Play a basketball");
	}
}

class Rugby extends Sports{
	void play() {
		System.out.println("Play a rugby");
	}
}
public class Assignment_03 {

	public static void main(String[] args) {
		Sports foot = new Football();
		foot.play();
		
		Sports basket = new Basketball();
		basket.play();
		
		Sports rugby = new Rugby();
		rugby.play();
	}

}
