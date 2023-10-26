package JavaOops5;

//Java program to create an interface  Playable with a method play() that takes no argument and returns void. 
//Create three classes football, basketball,volleyball that implements the playable interface and override the play 
//method to play the respective sports.


interface playable{
	void play();
}
class Football implements playable{
	public void play() {
		System.out.println("We play football");
	}
}
class Volleyball implements playable{
	public void play() {
		System.out.println("We paly volleyball");
		
	}
}
class Basketball implements playable{
	public void play() {
		System.out.println("We play basketball");
	}
}

public class Play01 {

	public static void main(String[] args) {

		playable foot=new Football();
		foot.play();
		
		playable volley =new Volleyball();
		volley.play();
		
		playable basket=new Basketball();
		basket.play();
		
	}

}
