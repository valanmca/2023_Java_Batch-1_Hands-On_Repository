package Day7;
interface Playable{
	void play();
}
class Football implements Playable{
	public void play() {
		System.out.println("Play Football");
	}
}
class Volyeyball implements Playable{
	public void play() {
		System.out.println("Play Volleyball");
	}
}
class Basketball implements Playable{
	public void play() {
		System.out.println("Play Basketball");
		
	}
}
public class Ass1 {
	public static void main(String[] args) {
		
		
		 Football Foo=new  Football();
		 Foo.play();
		 
		 Volyeyball Vol=new Volyeyball();
		 Vol.play();
		 
		 Basketball Bas=new Basketball();
		 Bas.play();
		 
		 

}}
