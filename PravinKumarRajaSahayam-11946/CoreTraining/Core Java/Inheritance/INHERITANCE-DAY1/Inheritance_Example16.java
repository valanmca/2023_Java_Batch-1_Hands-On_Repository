//Write a Java Programs to create a base class Sports with a method called play(). Create three subclasses: Football , Basketball , and , Rugby . Override the play() method in each subclass to play a specific statements for each sports.
class Sports 
{
	void play() 
	{
		System.out.println("We can plays any of the sports");
	}
}
class Football extends Sports 
{
	void play() 
	{
		System.out.println("There are totally 11 players in the football");
	}
}
class basketball extends Sports 
{
	void play() 
	{
		System.out.println("There are totally 12 players in the basketball");
	}
}
class Rugby extends Sports 
{
	void play() 
	{
		System.out.println("There are totally 15 players in the Rugby");
	}
}
public class Inheritance_Example16 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Sports obj1 = new Sports();
		obj1.play();
		Football obj2 = new Football();
		obj2.play();
		basketball obj3 = new basketball();
		obj3.play();
		Rugby obj4 = new Rugby();
		obj4.play();
		Sports obj5 = new Rugby();
		obj5.play();
	}

}
