package com.jenish.day5;
class Sports {
	void play() {
		System.out.println("Playing a sport...\n");
	}
}
class Football extends Sports {
	void play() {
		System.out.println("Playing a football...\n");
	}
}
class Basketball extends Sports {
	void play() {
		System.out.println("Playing a Basketball...\n");
	}
}
class Rugby extends Sports {
	void play() {
		System.out.println("Playing a Rugby...\n");
	}
}
public class Ex_03_Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports sports = new Sports();
		Football foot = new Football();
		Basketball bask = new Basketball();
		Rugby rug = new Rugby();
		
		
		sports.play();
		foot.play();
		bask.play();
		rug.play();
	}

}
