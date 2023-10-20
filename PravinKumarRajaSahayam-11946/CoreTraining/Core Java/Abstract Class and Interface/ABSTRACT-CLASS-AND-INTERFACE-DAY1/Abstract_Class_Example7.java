//Write a Java Programs to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball , and , Basketball that implements the Playable interface and override the play() method to play the respective sports.
interface Playable {
	void play();
}

class Football implements Playable {
	public void play() {
		System.out.println("We play this sports using Football");
	}
}

class Volleyball implements Playable {
	public void play() {
		System.out.println("We play this sports using Volleyball");
	}
}

class Basketball implements Playable {
	public void play() {
		System.out.println("We play this sports using Basketball");
	}
}

public class Abstract_Class_Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football balls = new Football();
		balls.play();
		Volleyball ball4 = new Volleyball();
		ball4.play();
		Basketball balle = new Basketball();
		balle.play();
	}

}