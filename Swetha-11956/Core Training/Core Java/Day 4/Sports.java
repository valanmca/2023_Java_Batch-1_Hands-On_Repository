package JavaOops4;

class sports1{
	void play(){
		System.out.println("Play");
	}
}
class Football extends sports1{
	void play() {
		System.out.println("We like to play football");
	}
}
class Basketball extends sports1{
	void play() {
		System.out.println("We like to play basketball");
	}
	
}
class Rugby extends sports1{
	void play() {
		System.out.println("We like to play rugby");
	}
}
public class Sports {

	public static void main(String[] args) {
		sports1 sp=new Football();
		sp.play();
		
		sports1 sp1=new Basketball();
		sp1.play();

		sports1 sp2=new Rugby();
		sp2.play();


		
	}

}
