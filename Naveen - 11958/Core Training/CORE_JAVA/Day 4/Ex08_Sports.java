package com.naveen.day4;
/*3. Write a Java program to create a base class Sports with a method called play(). 
 * Create three subclasses: Football, Basketball, and Rugby. Override the play() 
 * method in each subclass to play a specific statement for each sport.*/
class Sports{
	public void play() {
        System.out.println("Playing a sport...\n");
    }
}

class Football extends Sports{
	public void play() {
        System.out.println("Playing a Football...");
    }
}

class Basketball extends Sports{
	public void play() {
        System.out.println("Playing a Basketball...");
    }
}

class Rugby extends Sports{
	public void play() {
        System.out.println("Playing a Rugby...");
    }
}
public class Ex08_Sports {

	public static void main(String[] args) {
		
		Sports sports = new Sports();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Rugby rugby = new Rugby();

        sports.play();
        football.play();
        basketball.play();
        rugby.play();
		
	}

}
