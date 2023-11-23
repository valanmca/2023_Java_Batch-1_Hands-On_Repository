package Day6;
class sports1{
	public void play() {
		System.out.println("Sports");
	}
}
class Football extends sports1{
	public void play () {
		System.out.println("Play the Football");
	}
}
class Basketball extends sports1{
	public void play() {
		System.out.println("Play the Basketball");
	}	
}
class Rugby extends sports1{
	public void play() {
		System.out.println("Play the RUGBY");
	}
}
public class Sports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Football  Football =new Football ();
		Football.play();
		
		Basketball Basketball=new Basketball();
		Basketball.play();
		
		Rugby Rugby=new Rugby();
		Rugby.play();
		

	}

}
