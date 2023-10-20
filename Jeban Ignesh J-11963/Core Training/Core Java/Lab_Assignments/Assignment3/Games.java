package com.jeban.Assignment3;

class Sports{
	void Play() {
		System.out.println("Play");
	}
}
class Football extends Sports{
	void Play() {
		System.out.println("Play Footbal");
	}
}
class Basketball extends Sports{
	void Play() {
		System.out.println("Play Basket Ball");
	}
}
class Rugby extends Sports{
	void Play() {
		System.out.println("Play Rugby");
	}
}

public class Games {

	public static void main(String[] args) {
		Football foot=new Football();
		foot.Play();
		Basketball bas=new Basketball();
		bas.Play();
		Rugby rug=new Rugby();
		rug.Play();
		
	}

}
