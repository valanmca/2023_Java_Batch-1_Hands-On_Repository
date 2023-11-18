package Core_Topic_Domnic_Day_7;

interface Playable{
	void play();
}

class Football implements Playable{
	public void play() {
		System.out.println("Lets Play Football ");
	}
}
class Volleyball implements Playable{
	public void play() {
		System.out.println("Lets Play Volleyball ");
	}
}

class Basketball implements Playable{
	public void play() {
		System.out.println("Lets Play Basketball ");
	}
}

public class Assg_1 {

	public static void main(String[] args) {
    Football fb=new Football();
    fb.play();
    Volleyball vb=new Volleyball();
    vb.play();
    Basketball bb=new Basketball();
    bb.play();
	}

}
